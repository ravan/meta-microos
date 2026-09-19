SUMMARY = "Tibetan script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tibetan script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-tibetan-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "47b814bc4415fe4b65decd59ff458a0474dde4521e40e2eb50c760ca48286461fcf14ef4c5c1c22b67d61240ef20d2af166b8c253c9a9f2e52bf25f999a9421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-tibetan"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
