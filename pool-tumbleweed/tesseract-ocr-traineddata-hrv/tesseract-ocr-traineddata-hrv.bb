SUMMARY = "Croatian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Croatian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-hrv-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6b6ddf0ee5605e12250dddade115016d6c4a725fc33d3bc71aa3e2279eb258dca778d9e1dcb6ced31e12b92252a536b41c0018e21eee63c8f1feb2149d0824f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-hr \
tesseract-ocr-traineddata-croatian \
tesseract-ocr-traineddata-hrv \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-croatian"

RDEPENDS:${PN} += ""

inherit rpm
