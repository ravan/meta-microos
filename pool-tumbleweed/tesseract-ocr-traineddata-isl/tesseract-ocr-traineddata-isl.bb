SUMMARY = "Icelandic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Icelandic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-isl-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "acc8a47eff5a8a6077acc7ca8f2888d8e78c44b74bfe0809d30902a7270be1ae14cff1bf69f75a50e98ff8cdb9acea27f5941f1ced4e2883a17fb4f7699c7bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-is \
tesseract-ocr-traineddata-icelandic \
tesseract-ocr-traineddata-isl \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-icelandic"

RDEPENDS:${PN} += ""

inherit rpm
