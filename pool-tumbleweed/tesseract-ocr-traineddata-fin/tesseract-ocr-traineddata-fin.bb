SUMMARY = "Finnish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Finnish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fin-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "0c16f2d41b538849bd3fdeb8ee19918f85b0906f4b5fb505bceb85345b677569b673934add10386cd7cdf3d97735c93777ee9be4de89e14cea12765f82497615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-fi \
tesseract-ocr-traineddata-fin \
tesseract-ocr-traineddata-finnish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-finnish"

RDEPENDS:${PN} += ""

inherit rpm
