SUMMARY = "Hungarian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hungarian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-hun-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d0e3db2967df8634737782dc8bec893114705b903efaa0c04693a6c8f38966480912a2d8d693ddf4dc46e91776f5d4b30a34a87b1119fe71c95f129bd43248bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-hu \
tesseract-ocr-traineddata-hun \
tesseract-ocr-traineddata-hungarian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-hungarian"

RDEPENDS:${PN} += ""

inherit rpm
