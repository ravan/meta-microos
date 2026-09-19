SUMMARY = "Maori language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Maori language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mri-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "8ff1a74079d31860160254d906fec74a621c87445d01d46c584b03914e5e91505027a3e8b5dc0284cdc19e87606e7e22021398845a0648457ebc9fed7219143f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-mi \
tesseract-ocr-traineddata-maori \
tesseract-ocr-traineddata-mri \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-maori"

RDEPENDS:${PN} += ""

inherit rpm
