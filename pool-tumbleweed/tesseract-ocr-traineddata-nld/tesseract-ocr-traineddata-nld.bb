SUMMARY = "Dutch language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dutch language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-nld-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "722d871d4738720c57170732b265d9f82ab0be9bdb6e6cf2765dff9a617097bbdee729a872f68e2844cdf2b22925d77cba4372f776de8635517c5f913538584a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-nl \
tesseract-ocr-traineddata-dutch \
tesseract-ocr-traineddata-nld \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-dutch"

RDEPENDS:${PN} += ""

inherit rpm
