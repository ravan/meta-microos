SUMMARY = "Assamese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Assamese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-asm-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1cbd5b3226ce4f2c9d6ce3617f058596bbdc9d606e874464155331a4eb9b3ebc16b9f3d3a3dd5d4eb8523367c669f88c06bfa268355d3c8316613cbddd7c7c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-as \
tesseract-ocr-traineddata-asm \
tesseract-ocr-traineddata-assamese \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-assamese"

RDEPENDS:${PN} += ""

inherit rpm
