SUMMARY = "Uzbek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uzbek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-uzb-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2fad05595089c0057933a8f27504490b694946e2c19dddcb4062580c0e64d6a15531d569a620b8a7491e049bd5fca12520e1c55578454503897542114efd07f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-uz \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-uzb \
tesseract-ocr-traineddata-uzbek \
tesseract-traineddata-uzbek"

RDEPENDS:${PN} += ""

inherit rpm
