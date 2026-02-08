class Solution:
    def commonChars(self, words):
        result = []
        first_word = list(words[0])  
        for ch in first_word:
            found_in_all = True
            for i in range(1, len(words)):
                if ch in words[i]:
                    words[i] = words[i].replace(ch, "", 1)  
                else:
                    found_in_all = False
                    break
            if found_in_all:
                result.append(ch)

        return result
