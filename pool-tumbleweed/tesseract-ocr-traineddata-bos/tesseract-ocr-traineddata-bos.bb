SUMMARY = "Bosnian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bosnian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-bos-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "0c51acac29f5f704e98bcc0b6c10ccbaa54f548c405d336143a65470f526faec4109b59b992d6c4cf1d3ab1599280f6bb196d1e0c95a2f40807b1aeb740b6302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-bs \
tesseract-ocr-traineddata-bos \
tesseract-ocr-traineddata-bosnian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-bosnian"

RDEPENDS:${PN} += ""

inherit rpm
