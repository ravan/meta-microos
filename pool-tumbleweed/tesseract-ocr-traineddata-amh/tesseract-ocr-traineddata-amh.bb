SUMMARY = "Amharic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Amharic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-amh-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a175ac16e6cf2a41316fd967043eb0c84cd71dcf531b750219565b82b276b7309516c78ca02c5b07173507eb6150ffedbfbecd3a89a61126794434a7000244a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-an \
tesseract-ocr-traineddata-amh \
tesseract-ocr-traineddata-amharic \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-amharic"

RDEPENDS:${PN} += ""

inherit rpm
