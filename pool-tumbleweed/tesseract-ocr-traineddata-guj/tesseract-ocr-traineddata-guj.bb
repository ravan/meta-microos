SUMMARY = "Gujarati language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gujarati language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-guj-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c952e40000aff22a2a94b55896eb4f01fbdbcc6935b0c47336c2af6647a97e39d9d3a57286403b764f4ccf89d4165ddc0e0c2d2a9a666a190e74586571a2ddf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-gu \
tesseract-ocr-traineddata-guj \
tesseract-ocr-traineddata-gujarati \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-gujarati"

RDEPENDS:${PN} += ""

inherit rpm
