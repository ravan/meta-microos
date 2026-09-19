SUMMARY = "Japanese (Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese (Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-japanese_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "27a3e7c52ca355b690543e9d5aa8c7eada11f99b4a32d325bfe5c928951091597ddbe09bdb970c06ac71e582d0b9af9385927beda62cd5a3143ca15a6c438972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-japanese-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
