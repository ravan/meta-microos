SUMMARY = "Syriac language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Syriac language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-syr-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "666283c99c4d7394f14485963ed4e55d938d0841e894235a9f5e071444505fa713f2bb26a363b98c4a562ce16966f43129887b4ee2205cd9a76f7b444d599a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ar-SY \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-syr \
tesseract-ocr-traineddata-syriac \
tesseract-traineddata-syriac"

RDEPENDS:${PN} += ""

inherit rpm
