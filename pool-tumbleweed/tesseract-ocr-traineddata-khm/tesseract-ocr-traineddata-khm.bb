SUMMARY = "Khmer language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Khmer language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-khm-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "efc843d1708ec0bebc6016bdf7d61b955c5bf661960f5817c04c30d128b943994aea5087775f4519c1028cc1d23908e87cceea322f1a001d2f04c9b662f3120c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-km \
tesseract-ocr-traineddata-khm \
tesseract-ocr-traineddata-khmer \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-khmer"

RDEPENDS:${PN} += ""

inherit rpm
