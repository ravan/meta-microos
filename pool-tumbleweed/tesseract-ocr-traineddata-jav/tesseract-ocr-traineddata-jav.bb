SUMMARY = "Javanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Javanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-jav-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "bda7a99df55a645618b1c89b3cf5409c052dc722ce2dabefdb818f326c81ddecbb44552cce6c60d674a62e7c5fcbd968567bf9fd3687747e3b2d73b2d714a98f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-jav \
tesseract-ocr-traineddata-jav \
tesseract-ocr-traineddata-javanese \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-javanese"

RDEPENDS:${PN} += ""

inherit rpm
