SUMMARY = "Sinhala language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sinhala language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-sin-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "7e2e0fb02a5ed6cbc9a1293d4cf7172d3831834547be952558766721dee04410463314d8ab34526b72ec67903962fde0b0831d2e24727cb4cb904ce6b86b356c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-si \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-sin \
tesseract-ocr-traineddata-sinhala \
tesseract-traineddata-sinhala"

RDEPENDS:${PN} += ""

inherit rpm
