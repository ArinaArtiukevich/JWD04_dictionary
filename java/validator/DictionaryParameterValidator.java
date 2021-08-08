package validator;

import entity.Pair;
import entity.ParameterListDao;
import exception.ValidatorException;

import java.util.ArrayList;

public interface DictionaryParameterValidator {
     void validatePairOrWordsNull(Pair englishAndRussianWord) throws ValidatorException;
     void validatePairIsNull(Pair englishAndRussianWord) throws ValidatorException;
     void validateEnglishWordIsNull(Pair englishAndRussianWord) throws ValidatorException;
     void validateRussianWordIsNull(Pair englishAndRussianWord) throws ValidatorException;
     void validateListIsNull(ArrayList<Pair> pairsList) throws ValidatorException;
     void validateListIsEmpty(ArrayList<Pair> pairsList ) throws ValidatorException;
     void validateParameterListIsNull(ParameterListDao pairsList) throws ValidatorException;
}
