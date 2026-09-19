SUMMARY = "Tatar language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tatar language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tat-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b639dbc6db7724735c42b96569807cbe3ee2d7d30e37d7a8103486859d0893f8b89b08efb6c162e27f8a703e3dc018c4f307b9538fa030562dee4a40ef845c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-tt \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tat \
tesseract-ocr-traineddata-tatar \
tesseract-traineddata-tatar"

RDEPENDS:${PN} += ""

inherit rpm
