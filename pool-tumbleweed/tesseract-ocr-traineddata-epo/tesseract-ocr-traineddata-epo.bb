SUMMARY = "Esperanto language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Esperanto language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-epo-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9988fd3c06d3eac6d27baebfa66b22ae4855409f94be1e40b9558cac50ef6ba52f554b63a8ed683e3e2c31651230d3a998aadafdec5a97d723f98a23b642da56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-eo \
tesseract-ocr-traineddata-epo \
tesseract-ocr-traineddata-esperanto \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-esperanto"

RDEPENDS:${PN} += ""

inherit rpm
