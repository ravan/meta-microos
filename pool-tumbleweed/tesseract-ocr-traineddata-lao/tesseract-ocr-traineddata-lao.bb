SUMMARY = "Lao language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lao language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-lao-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d3d26f8570bcd46d72a858a38c8ce95e9c8cf2ce5e6dc4b1f1af8f6005b20ee656cf7192efa53471097d1e61a4ae133dfd1982189735d924336b93f8b746038d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-lo \
tesseract-ocr-traineddata-lao \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-lao"

RDEPENDS:${PN} += ""

inherit rpm
