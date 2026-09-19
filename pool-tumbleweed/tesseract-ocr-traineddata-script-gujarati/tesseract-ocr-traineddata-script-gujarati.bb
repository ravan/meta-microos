SUMMARY = "Gujarati script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gujarati script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-gujarati-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "4ccabea16f1e429aeec6d4934e68bd010a0a528a3d26beff7601eae2b2a0e90c45cde75ebc1468279bf338fbcd1cc9eaea28505072dbf6d3ff1276bb497fedef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-gujarati"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
