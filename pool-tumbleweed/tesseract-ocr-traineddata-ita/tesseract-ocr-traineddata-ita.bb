SUMMARY = "Italian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Italian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ita-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c58b5ad8ae09ce6c6a5ce9f9a813d4c2ad95253204223f50c55159190f0e385bf224c11fca7ca4d4d4dd5335157c8c3d0e3457100b34fe48b773efedad66bc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-it \
tesseract-ocr-traineddata-ita \
tesseract-ocr-traineddata-italian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-italian"

RDEPENDS:${PN} += ""

inherit rpm
