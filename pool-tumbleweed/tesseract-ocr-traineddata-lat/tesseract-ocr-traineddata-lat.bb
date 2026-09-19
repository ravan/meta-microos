SUMMARY = "Latin language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latin language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-lat-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "ceec545cb002f099d9d008633e2bce166a5c69da2c757e62a2632d85f365798213fe8fa4ebdd4372ef52f2a6ec212e2bd802041164c26717c89394c493c29bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-lat \
tesseract-ocr-traineddata-lat \
tesseract-ocr-traineddata-latin \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-latin"

RDEPENDS:${PN} += ""

inherit rpm
