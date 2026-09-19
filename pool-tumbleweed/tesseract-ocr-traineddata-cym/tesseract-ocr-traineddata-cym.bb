SUMMARY = "Welsh language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Welsh language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-cym-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "081da588f49153f344d89e400f9048200a29a7e61229ad97425631deddef20304a3a4c2dc1fe10cd58d40be98ee6d4094c5d9ebfff93ec1cd6d36b25a1144a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-cy \
tesseract-ocr-traineddata-cym \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-welsh \
tesseract-traineddata-welsh"

RDEPENDS:${PN} += ""

inherit rpm
