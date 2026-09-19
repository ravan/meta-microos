SUMMARY = "Swedish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Swedish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-swe-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "642dfdbab330dd038b1b0047ce95ae3d55b14006fc4f64217e215332211e66b607ea57d4d16018620d8d5fb027c01c0bf696d04c4879d8258f6e4ec6b4936010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sv \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-swe \
tesseract-ocr-traineddata-swedish \
tesseract-traineddata-swedish"

RDEPENDS:${PN} += ""

inherit rpm
