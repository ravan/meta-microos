SUMMARY = "Inuktitut language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Inuktitut language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-iku-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6254621cc930f09a646f0706c56ee6d3c248877e692211be670e50f762a15333f01e2657d0cf95c125e917313f64601bfdd0bc03aab4ea066a8279be714a4504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-iu \
tesseract-ocr-traineddata-iku \
tesseract-ocr-traineddata-inuktitut \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-inuktitut"

RDEPENDS:${PN} += ""

inherit rpm
