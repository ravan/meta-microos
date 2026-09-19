SUMMARY = "Devanagari script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Devanagari script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-devanagari-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d54e7a2d69c3e6dc5462ab36d696a83bee7319e81573dd72b0d89ad49d107b030b50b26fbd2d0d5c55e68b3cc651070ed09dea2f66fc0b0c64202f27a0ab13d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-devanagari"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
