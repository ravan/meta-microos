SUMMARY = "Yoruba language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Yoruba language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-yor-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a142e0d5b2738451445b3be1c9892d2efae57bd7ea5291b8aa250fb4398da7bb2da8d4b09a8ff0f86d7cad90871d39db35a4e2f418f739d7bec491ed5a0ac0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-yo \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-yor \
tesseract-ocr-traineddata-yoruba \
tesseract-traineddata-yoruba"

RDEPENDS:${PN} += ""

inherit rpm
