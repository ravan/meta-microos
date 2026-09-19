SUMMARY = "Bengali language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bengali language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ben-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6fd71107ef3d31b4aa086bc7e79d0ecc01449c87533ada4187fd42dabd7fc26d903df7d1a4dc699c23991dd37f406e6fb5ad44e5bc9ffea15380ede1deb83c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-bn \
tesseract-ocr-traineddata-ben \
tesseract-ocr-traineddata-bengali \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-bengali"

RDEPENDS:${PN} += ""

inherit rpm
