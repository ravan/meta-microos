SUMMARY = "Faroese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Faroese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fao-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "61d7bca778aef33faaf13ae8b2ae45dac7e150557ee28dd55177f5fdcce32fa6c3d247c132c6c2c83a8c8d6eefea7ab38a691d5a64bd2eea628397c7827c6340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-fo \
tesseract-ocr-traineddata-fao \
tesseract-ocr-traineddata-faroese \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-faroese"

RDEPENDS:${PN} += ""

inherit rpm
