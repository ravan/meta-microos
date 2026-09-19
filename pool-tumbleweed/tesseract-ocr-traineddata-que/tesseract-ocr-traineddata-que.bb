SUMMARY = "Quechuan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Quechuan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-que-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "ef0a4b0957a363c27b617f6704c4743155a44d006c8c46d4afc49eface72754e13a3f51f9667182d63be3e5d15b0382ddede22ebbebe80305d8c704696e6739c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-qu \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-que \
tesseract-ocr-traineddata-quechuan \
tesseract-traineddata-quechuan"

RDEPENDS:${PN} += ""

inherit rpm
