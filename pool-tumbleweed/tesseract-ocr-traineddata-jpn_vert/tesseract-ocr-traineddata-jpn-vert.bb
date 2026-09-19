SUMMARY = "'Japanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the 'Japanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-jpn_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "cf6265d7b15e0a8a36ddef94b5ad673dcdab9a27542c3d4905f5e74a4b4d28965ffdc82e3328e7f4862ee0965bf9cb0819399a0547b4215d0d584f0ac2ea4c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ja \
tesseract-ocr-traineddata-japanese-vertical \
tesseract-ocr-traineddata-jpn-vert \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-japanese-vertical"

RDEPENDS:${PN} += ""

inherit rpm
