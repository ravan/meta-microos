SUMMARY = "Han (Traditional, Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Traditional, Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hant_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "880e5b94ddb97ea8fd67470f0d879add40e379b17720ef73bb76a747e0559a3ccc4cb3ef487c0a23f0d26337d17c567205ec1c380b2a023ac7fbe41da1e6337e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hant-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
