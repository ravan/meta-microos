SUMMARY = "Polish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Polish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-pol-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "064a071a60d8d7bcffc73cc7b7c22a82a3e00454dc9efd599c29965dfa793236d8f3954621c22150e0a6bc808922377136ffa6fa0055a000abeb0bfe7aeb29f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-pl \
tesseract-ocr-traineddata-pol \
tesseract-ocr-traineddata-polish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-polish"

RDEPENDS:${PN} += ""

inherit rpm
