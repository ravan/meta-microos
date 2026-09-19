SUMMARY = "Cyrillic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cyrillic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-cyrillic-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9bb3ff09ff3e77ae76ca5173db472038da5f405f6f54d21d0872e4d31e4bb0dcde94bfa897a0b15e9239e0dba621069cfe533b11d48d0c95945d9e014bc5bba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-cyrillic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
