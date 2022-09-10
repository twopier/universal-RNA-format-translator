package it.unicam.cs.twopier.tarnas;

/**
 *
 */
public interface RNAFormatTranslator {

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToDB(RNAFile rnaFile);

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToDBNoSequence(RNAFile rnaFile);

    FormattedRNAFile translateToBPSEQ(RNAFile rnaFile);

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToCT(RNAFile rnaFile);

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToAAS(RNAFile rnaFile);

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToAASNoSequence(RNAFile rnaFile);

    /**
     * @param rnaFile
     * @return
     */
    FormattedRNAFile translateToFASTA(RNAFile rnaFile);

}
