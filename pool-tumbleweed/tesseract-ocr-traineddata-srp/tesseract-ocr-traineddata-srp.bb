SUMMARY = "Serbian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Serbian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-srp-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "4e273bd79f56ea8bfc231eb76bad479b1ed4a9109b8c4548f4ba4ed75431ebc2386633ee74f2190d44b4c8f32102460a90ccdcafd3aa6e9941bb382338e2d7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sr \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-serbian \
tesseract-ocr-traineddata-srp \
tesseract-traineddata-serbian"

RDEPENDS:${PN} += ""

inherit rpm
