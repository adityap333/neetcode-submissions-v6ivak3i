class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Format: [length of string] + [delimiter] + [the actual string]
            // Example: "Apple" becomes "5;;Apple"
            // Example: "" becomes "0;;"
            sb.append(str.length()).append(";;").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string back to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }

        int i = 0;
        while (i < str.length()) {
            // Find where the delimiter starts after the number
            int delimiterIdx = str.indexOf(";;", i);
            // Read the length of the upcoming string chunk
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            // Move pointer past the number and the 2-character delimiter ";;"
            i = delimiterIdx + 2;
            // Extract the exact substring using the parsed length
            String originalStr = str.substring(i, i + length);
            result.add(originalStr);
            // Advance the pointer past the extracted string to process the next chunk
            i += length;
        }

        return result;
    }
}