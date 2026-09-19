SUMMARY = "Arabic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Arabic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-arabic-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "f31bddd597c1174eb8ca3aec757a94e8dcc8e38a522778d4542a569d2ea6259b273fa697d2bc5cd6b77a3aa74f12cac7c4abaafe7d3e39b7f2f2f1ca6ae72592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-arabic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
