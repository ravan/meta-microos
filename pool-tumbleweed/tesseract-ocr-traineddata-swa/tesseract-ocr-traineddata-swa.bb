SUMMARY = "Swahili language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Swahili language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-swa-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "57961f1ca450cb1d17d84784b21f92b417f5d5d34f4f366b02bcd6da0c382f90aec77308610d72ceae666879439ca8709cbbe150765736ba5411eafd65c4cfe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sw \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-swa \
tesseract-ocr-traineddata-swahili \
tesseract-traineddata-swahili"

RDEPENDS:${PN} += ""

inherit rpm
