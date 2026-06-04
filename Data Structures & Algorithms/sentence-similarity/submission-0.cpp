class Solution {
public:
    bool areSentencesSimilar(vector<string>& sentence1, vector<string>& sentence2, vector<vector<string>>& similarPairs) {
        if(sentence1.size() != sentence2.size())
        {
            return false;
        }

        bool areSentencesSimilar = true;

        for(size_t inx = 0; inx < sentence1.size(); ++inx)
        {
            if(sentence1[inx] == sentence2[inx])
            {
                continue;
            }
            else
            {
                bool pairFound = false;
                for(const auto& similarPair : similarPairs)
                {
                    if((similarPair[0] == sentence1[inx] && similarPair[1] == sentence2[inx]) ||
                    (similarPair[1] == sentence1[inx] && similarPair[0] == sentence2[inx]))
                    {
                        pairFound = true;
                        break;
                    }
                }

                areSentencesSimilar = pairFound;
                if(areSentencesSimilar == false)
                {
                    break;
                }
            }
        }

        return areSentencesSimilar;
    }
};
