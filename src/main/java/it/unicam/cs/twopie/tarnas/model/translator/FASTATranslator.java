package it.unicam.cs.twopie.tarnas.model.translator;

import it.unicam.cs.twopie.tarnas.model.rnafile.FormattedRNAFile;
import it.unicam.cs.twopie.tarnas.model.rnafile.RNAFile;
import it.unicam.cs.twopie.tarnas.model.rnafile.RNAFormatType;

/**
 *
 */
public class FASTATranslator implements RNAFormatTranslator {
    @Override
    public FormattedRNAFile translateToDB(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.DB.toString());
    }

    @Override
    public FormattedRNAFile translateToDBNoSequence(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.DB_NO_SEQUENCE.toString());
    }

    @Override
    public FormattedRNAFile translateToBPSEQ(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.BPSEQ.toString());
    }

    @Override
    public FormattedRNAFile translateToCT(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.CT.toString());
    }

    @Override
    public FormattedRNAFile translateToAAS(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.AAS.toString());
    }

    @Override
    public FormattedRNAFile translateToAASNoSequence(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.AAS_NO_SEQUENCE.toString());
    }

    @Override
    public FormattedRNAFile translateToFASTA(RNAFile rnaFile) {
        throw new NoSupportedTranslationException(RNAFormatType.FASTA.toString());
    }
}
