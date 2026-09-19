SUMMARY = "Middle English (1100-1500) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Middle English (1100-1500) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-enm-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "0032df625ff5b8d9dae7c2ad6da6ef28c095cb9083a77ee0061dedf4d1bd34089c5d9492a0c06ec668de03874edea6858853ea5e9d211da02bd06b2f58158ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-english-middle \
tesseract-ocr-traineddata-enm \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-english-middle"

RDEPENDS:${PN} += ""

inherit rpm
