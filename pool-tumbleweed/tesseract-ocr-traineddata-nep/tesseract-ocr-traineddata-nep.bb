SUMMARY = "Nepali language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Nepali language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-nep-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "faf36cb7ffa1054c1614d9b26a6b0dcb7b1771458d0ac2973bd7f799263efb17dd44b62241f301b1863f1e8dbb055f0f7d5122c5b00c1d76d8171b2e0c87f7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ne \
tesseract-ocr-traineddata-nep \
tesseract-ocr-traineddata-nepali \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-nepali"

RDEPENDS:${PN} += ""

inherit rpm
