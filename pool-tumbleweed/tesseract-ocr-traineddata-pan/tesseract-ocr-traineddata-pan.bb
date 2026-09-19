SUMMARY = "Panjabi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Panjabi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-pan-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "12e8cd18de6fd5a867f66ad9f165c760c18baab90bfc607da154da074801862c0506926e30693476198b086f7fa1a5ba1d2645debc591417f24cd4cbcb18dfae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-pa \
tesseract-ocr-traineddata-pan \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-punjabi \
tesseract-traineddata-punjabi"

RDEPENDS:${PN} += ""

inherit rpm
