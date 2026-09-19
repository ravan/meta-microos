SUMMARY = "Breton language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Breton language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-bre-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "eb2b43a4b00ce68388c44dd048317589dc765f82c4135b764fa13f09771188a50f86619fbd535f197a6c13e94d26f18433ae5df5d12e125f82b2c8a0026a9214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-br \
tesseract-ocr-traineddata-bre \
tesseract-ocr-traineddata-breton \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-breton"

RDEPENDS:${PN} += ""

inherit rpm
