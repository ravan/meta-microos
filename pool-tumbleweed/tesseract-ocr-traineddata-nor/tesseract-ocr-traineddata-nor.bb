SUMMARY = "Norwegian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Norwegian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-nor-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "5d0b3f98313fd6d78b72ea1034345545eaab807b989b88358e4ddbe850cad8d525e48ccdbdc8b3a295c238a3aa496bb864249496f6f7393d45fdc614b25fa3d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-no \
tesseract-ocr-traineddata-nor \
tesseract-ocr-traineddata-norwegian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-norwegian"

RDEPENDS:${PN} += ""

inherit rpm
