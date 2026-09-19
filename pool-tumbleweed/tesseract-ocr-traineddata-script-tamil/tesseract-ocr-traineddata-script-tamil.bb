SUMMARY = "Tamil script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tamil script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-tamil-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d4486e09cbb827d447c38ed68e0723c9d00ea2e5b486cd8d0013fc81aae9e6de9d0279884264175f99710d59ec6d29af29e6836ebfdab8690d01a4372ec6d37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-tamil"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
