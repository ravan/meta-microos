SUMMARY = "Georgian script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-georgian-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1271a8dc0a8ecda94a62ae5363d2a7b4461b8dbfdc3de06258dde2747899fafbcb44a03f3cd310cd4fe0e3415b639e7e6097ac02e62d9fe852864446ecd593f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-georgian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
