SUMMARY = "Basque language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Basque language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-eus-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "62193ff7e71879d183c38fb69ffd474d5078cd25af5574e82354027695e9285a5191f18e17eb892ce70268e6ad794e7208de30369014633842fe4a613b068fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-eu \
tesseract-ocr-traineddata-basque \
tesseract-ocr-traineddata-eus \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-basque"

RDEPENDS:${PN} += ""

inherit rpm
