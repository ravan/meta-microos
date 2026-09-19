SUMMARY = "Thai script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thai script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-thai-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "26b3e696a0bad9bbb196b87077f4f19b8d526e393b7c2c43df087b467e9fc890eb5c593417e64efe95af837e4664695008d3acbce5bcf287683d6ae2d8f431b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-thai"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
