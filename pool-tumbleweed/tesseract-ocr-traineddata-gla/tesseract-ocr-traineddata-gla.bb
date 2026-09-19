SUMMARY = "Gaelic; Scottish Gaelic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gaelic; Scottish Gaelic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-gla-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c210b981dc6cc8f9b87e1fc69d941d2678404a80877ee6c193321c5bbb7fb5defc314e9cb457ee19d551e0514d7e6b8376a5795f6eeaed748df837aa7cb05c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-gd \
tesseract-ocr-traineddata-gaelic \
tesseract-ocr-traineddata-gla \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-gaelic"

RDEPENDS:${PN} += ""

inherit rpm
