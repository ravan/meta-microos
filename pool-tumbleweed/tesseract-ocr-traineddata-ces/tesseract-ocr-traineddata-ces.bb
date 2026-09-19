SUMMARY = "Czech language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Czech language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ces-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "520276c182e8dbb791b0254cc91ca802a99ec4f17aba512b7b277aafcca33e8c8f81afae162230b42b8580cf6eab32e4535335d0f3b75fcc224a6c1ca024d972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-cs \
tesseract-ocr-traineddata-ces \
tesseract-ocr-traineddata-czech \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-czech"

RDEPENDS:${PN} += ""

inherit rpm
