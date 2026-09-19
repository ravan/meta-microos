SUMMARY = "Telugu language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Telugu language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tel-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "09a4aae9214f076c258e3e7c22007deed29daf48d16c0bcca6b624b3e1d4d46486c0b93df050bba1f81d13df2c2e4d064038df036be0dd57639560eda1291c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-te \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tel \
tesseract-ocr-traineddata-telugu \
tesseract-traineddata-telugu"

RDEPENDS:${PN} += ""

inherit rpm
