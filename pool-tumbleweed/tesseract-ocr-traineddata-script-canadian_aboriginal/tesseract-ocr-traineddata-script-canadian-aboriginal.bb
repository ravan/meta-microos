SUMMARY = "Canadian (Aboriginal) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Canadian (Aboriginal) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-canadian_aboriginal-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "06600e3670d62cac3db18aec22b367a527cf439fa912825ab445ac8db897ec9b180e48a4ade49f5f56d0b555d021306d6fd85bc7792bb4e2f80c6a5693f9af1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-canadian-aboriginal"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
