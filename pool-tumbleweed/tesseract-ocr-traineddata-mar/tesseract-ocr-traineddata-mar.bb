SUMMARY = "Marathi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Marathi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mar-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "de50be559dca25dc31d27c01411ec7c16bdf0bcefcac8c58a0d61e7d39c16eb9747d3139540ad2345ef392386a973a9386b2bc01dbf42bcb12832ab29ca35a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-mr \
tesseract-ocr-traineddata-mar \
tesseract-ocr-traineddata-marathi \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-marathi"

RDEPENDS:${PN} += ""

inherit rpm
