SUMMARY = "Spanish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Spanish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-spa-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "94a3869e0eec5b8165dff4ba619bec9cf9e3f47bff42751f86db48876375c1fa80b725e8f1cd3d6cf3cb4f252ad4ff710c7465ca647dd713d1ef7a0cc7516b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-es \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-spa \
tesseract-ocr-traineddata-spanish \
tesseract-traineddata-spanish"

RDEPENDS:${PN} += ""

inherit rpm
