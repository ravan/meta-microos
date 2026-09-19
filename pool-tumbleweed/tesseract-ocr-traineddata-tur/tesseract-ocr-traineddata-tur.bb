SUMMARY = "Turkish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Turkish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tur-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a9a302301c186848f58dc9e02a9471dc6b4080904c4b9e4f7b92a1a0771b74abc5629240407fcff9e01b52681eb4c0aca19ba01904fe3b6c7bc3633348b09d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-tr \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tur \
tesseract-ocr-traineddata-turkish \
tesseract-traineddata-turkish"

RDEPENDS:${PN} += ""

inherit rpm
