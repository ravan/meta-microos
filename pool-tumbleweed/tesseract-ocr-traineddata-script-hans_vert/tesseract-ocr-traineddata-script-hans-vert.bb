SUMMARY = "Han (Simplified, Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Simplified, Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hans_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "cca29187f57f048015a6b7c9ca90d55513ff21d9cad63674781df475a3f2ac60d30238e2f9807a000fc79008c2c90a9fce944db094f1aed5637a8c386e92a28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hans-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
