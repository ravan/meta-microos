SUMMARY = "Macedonian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Macedonian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mkd-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c41ea6b9aa5d9e7e82120b70b48c98e3c5d582de445ec28598cfed8b9219fa8b5a642df7dbc475f6636ae92f27fe722b5c414f6137f2e083fb32f3482b497fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-mk \
tesseract-ocr-traineddata-macedonian \
tesseract-ocr-traineddata-mkd \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-macedonian"

RDEPENDS:${PN} += ""

inherit rpm
