SUMMARY = "Russian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Russian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-rus-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1b84a98900a8ab0cbaa2982c4588e1e4a0bc1e31b767840fb68339074365624529fd78be3becab7da72f2a3bc597a3af02a41de3a03631c569aae4d2e490c140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ru \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-rus \
tesseract-ocr-traineddata-russian \
tesseract-traineddata-russian"

RDEPENDS:${PN} += ""

inherit rpm
