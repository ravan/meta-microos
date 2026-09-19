SUMMARY = "Albanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Albanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-sqi-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "dce395111666e75cbad1452359ce85163d20c2a530e90380529e0336899122a8fdf6cd194dff6240b4e22c78cbf923adceb899635b036c4d841babcd1c388ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sq \
tesseract-ocr-traineddata-albanian \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-sqi \
tesseract-traineddata-albanian"

RDEPENDS:${PN} += ""

inherit rpm
