SUMMARY = "Galician language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Galician language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-glg-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1646483ccf4a3a496b3bcd306cbd92815d21bd9605cdc020f64685e90298c91e2a2327e0a50feb072841ab4884884ea340296e85f9b0eeeb933b164684a39804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-gl \
tesseract-ocr-traineddata-galician \
tesseract-ocr-traineddata-glg \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-galician"

RDEPENDS:${PN} += ""

inherit rpm
