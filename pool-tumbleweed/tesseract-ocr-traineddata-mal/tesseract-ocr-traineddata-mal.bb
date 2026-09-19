SUMMARY = "Malayalam language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malayalam language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mal-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "3d3c47fce5b023868b7fd057e4b7145317007a2c1b63d01dedab6c59a65cdff3e6e33c9fc221f1848368ff3c4a821af95dc0a3235b12dfede973e20253f3ab77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ml \
tesseract-ocr-traineddata-mal \
tesseract-ocr-traineddata-malayalam \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-malayalam"

RDEPENDS:${PN} += ""

inherit rpm
