SUMMARY = "Gurmukhi script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gurmukhi script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-gurmukhi-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "81da532bca34f0029e79e83f1aa54ee50b4071d547352f2da84f55827e14913934f5b15a7970c7a848c78bce17f0bdfd7bfbb933f9f2139d264d36805dcca30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-gurmukhi"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
