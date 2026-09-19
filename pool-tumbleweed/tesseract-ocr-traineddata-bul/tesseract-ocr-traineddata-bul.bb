SUMMARY = "Bulgarian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bulgarian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-bul-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "88220e2c87b6fb0041040745cb7a658963776446540c57ff224ea1d78b0c87bb7952fa9abb0c6e851b7a314e1beef844771c08364ac76b77e804fe273387d45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-bg \
tesseract-ocr-traineddata-bul \
tesseract-ocr-traineddata-bulgarian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-bulgarian"

RDEPENDS:${PN} += ""

inherit rpm
