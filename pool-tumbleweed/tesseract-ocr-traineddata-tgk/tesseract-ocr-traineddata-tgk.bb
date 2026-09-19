SUMMARY = "Tajik language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tajik language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tgk-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "e5f9d2293da3bdf4c3dcc92cf917c83e59107a23e5ad4afa9d9a8ab7e254832373af49449f43fefef203cefbde3c2c4bd61189b46a1727923763bc4f7ffa6e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-tg \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tajik \
tesseract-ocr-traineddata-tgk \
tesseract-traineddata-tajik"

RDEPENDS:${PN} += ""

inherit rpm
