SUMMARY = "Spanish (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Spanish (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-spa_old-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "07590c98ffbaa9869d2a439dfcf0d7513c0cbed309ac356a76426b7f8db591f6fc386e00f62c7047b631e1ef1f336c479771377ecde03bc8f72a0125e2009241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-spa-old \
tesseract-ocr-traineddata-spanish-old \
tesseract-traineddata-spanish-old"

RDEPENDS:${PN} += ""

inherit rpm
