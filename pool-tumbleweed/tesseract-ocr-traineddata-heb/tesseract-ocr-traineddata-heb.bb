SUMMARY = "Hebrew language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hebrew language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-heb-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9d2c8b0522cfceec5bf25059bbe10dc40254b101762a5bda617b95fa8047c363768805ad7a81efcb37839ee008fc0b0f072820785fa19756b1d95a2fd6c29969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-he \
tesseract-ocr-traineddata-heb \
tesseract-ocr-traineddata-hebrew \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-hebrew"

RDEPENDS:${PN} += ""

inherit rpm
