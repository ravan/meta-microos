SUMMARY = "Danish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Danish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-dan-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "54e3c28dece720a0ef3b9d49d68a539bd87c8e302ecc2db89ede5467c3ce72fa6c7897f76a65cc6456f22f6b1a3868fdc2e7e4f49583bccf8b4e5ac0975309d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-da \
tesseract-ocr-traineddata-dan \
tesseract-ocr-traineddata-danish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-danish"

RDEPENDS:${PN} += ""

inherit rpm
