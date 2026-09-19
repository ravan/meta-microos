SUMMARY = "French language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the French language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fra-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "5c0298f647c0a261904951e294aa7446827be6a7eb1fd3b8aabffece997a40d63d7974391a933a62b60e49a5546b3c6b6d2093a3cc00aad0c8203e440adc5860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-fr \
tesseract-ocr-traineddata-fra \
tesseract-ocr-traineddata-french \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-french"

RDEPENDS:${PN} += ""

inherit rpm
