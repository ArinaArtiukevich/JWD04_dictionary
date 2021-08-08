package validator.impl;

import entity.Pair;
import entity.ParameterListDao;
import exception.ValidatorException;
import validator.DictionaryParameterValidator;

import java.util.ArrayList;

public class DictionaryParameterValidatorImpl implements DictionaryParameterValidator {

    @Override
    public void validatePairOrWordsNull(Pair englishAndRussianWord) throws ValidatorException {
        validatePairIsNull(englishAndRussianWord);
        validateEnglishWordIsNull(englishAndRussianWord);
        validateRussianWordIsNull(englishAndRussianWord);
    }

    @Override
    public void validatePairIsNull(Pair englishAndRussianWord) throws ValidatorException {
        if (englishAndRussianWord == null) {
            throw new ValidatorException("Calculator Validator Exception: Pair == null.");
        }
    }

    @Override
    public void validateEnglishWordIsNull(Pair englishAndRussianWord) throws ValidatorException {
        if (englishAndRussianWord.getEnglishWord() == null) {
            throw new ValidatorException("Calculator Validator Exception: EnglishWord == null.");
        }
    }

    @Override
    public void validateRussianWordIsNull(Pair englishAndRussianWord) throws ValidatorException {
        if (englishAndRussianWord.getRussianWord() == null) {
            throw new ValidatorException("Calculator Validator Exception: RussianWord == null.");
        }
    }

    @Override
    public void validateListIsNull(ArrayList<Pair> pairsList) throws ValidatorException {
        if (pairsList == null) {
            throw new ValidatorException("Calculator Validator Exception: List == null.");
        }
    }

    @Override
    public void validateListIsEmpty(ArrayList<Pair> pairsList ) throws ValidatorException {
        if (pairsList.isEmpty()) {
            throw new ValidatorException("Calculator Validator Exception: Array is empty.");
        }
    }
    @Override
    public void validateParameterListIsNull(ParameterListDao pairsList) throws ValidatorException {
        if (pairsList == null) {
            throw new ValidatorException("Calculator Validator Exception: Array is empty.");
        }
    }
}
