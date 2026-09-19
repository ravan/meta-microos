SUMMARY = "Han (Simplified) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Simplified) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hans-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "146456b94659b58ee8e669a8ffe90c8fc60f54426543f71806b3a4d5eb05b0bec3a0f0211cb36c74bc49f0c8d7e0cc5ab4fb114aaead7195fa68832218621f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hans"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
