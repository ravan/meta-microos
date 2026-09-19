SUMMARY = "Catalan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Catalan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-cat-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "58ac4bb5b856fd71103c39b10c1b03534a1a1d9c796e9e79786347d1b8c61dec6eace2cdb9e247dc764847b684f439d35f009d5ec20ecc24c6857a18eaf972eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ca \
tesseract-ocr-traineddata-cat \
tesseract-ocr-traineddata-catalan \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-catalan"

RDEPENDS:${PN} += ""

inherit rpm
