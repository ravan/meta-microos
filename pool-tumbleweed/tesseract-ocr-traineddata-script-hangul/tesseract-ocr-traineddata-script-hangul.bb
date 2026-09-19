SUMMARY = "Hangul script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hangul script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hangul-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "3f745812a9be49610655f29f9fb0c80cca73247a61d8d7d8d3d52556830766029ad1f8b1d57ad34213bc0d79f35b319c3fefa3861224816b2ed47b82e320bf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hangul"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
