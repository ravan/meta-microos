SUMMARY = "Kurmanji language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kurmanji language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kmr-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "63a6260d24a35bba1dac89f99f89c47d76b5ed83137c849348d3215e81626c0aee3736d1e706541b8aa48d6fdf059d09c5a23516d8f152c1b7bd0c606c1d404e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ku \
tesseract-ocr-traineddata-kmr \
tesseract-ocr-traineddata-kurmanji \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-kurmanji"

RDEPENDS:${PN} += ""

inherit rpm
