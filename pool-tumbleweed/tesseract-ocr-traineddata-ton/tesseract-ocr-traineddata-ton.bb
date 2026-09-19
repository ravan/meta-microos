SUMMARY = "Tongan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tongan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ton-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "bf582d9fbc8b97d27cc3582a381f2a91735c4af5f10ade3e36492fc8a233ab6265972c051d3adce83bfab18e2073bf2e9e1f54fa8cd3e2430fd058011238c0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-to \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-ton \
tesseract-ocr-traineddata-tongan \
tesseract-traineddata-tongan"

RDEPENDS:${PN} += ""

inherit rpm
