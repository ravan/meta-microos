SUMMARY = "Cebuano language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cebuano language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ceb-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1e94037360503304b6d3abe530101247e3327519cc9db5d10bca5e3849ee9766a4e2fb38ef400c8a7e9cf59716e2d8429b69cb9ca752637d021e21daaa7895f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ceb \
tesseract-ocr-traineddata-cebuano \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-cebuano"

RDEPENDS:${PN} += ""

inherit rpm
