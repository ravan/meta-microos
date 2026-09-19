SUMMARY = "Tibetan (Standard) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tibetan (Standard) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-bod-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "ac03b44172ec8dbbc32dbf94fec49dc4bedeae3c450670bcff2e3d72ddcfe16842492c2966af203f19e7e1b6012a359094f598d38e964ffe13cdc56c835ad86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-bo \
tesseract-ocr-traineddata-bod \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tibetan-standard \
tesseract-traineddata-tibetan-standard"

RDEPENDS:${PN} += ""

inherit rpm
