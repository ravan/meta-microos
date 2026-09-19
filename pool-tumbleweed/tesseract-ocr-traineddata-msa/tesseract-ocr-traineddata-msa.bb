SUMMARY = "Malay language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malay language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-msa-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c3240271f60e8f81ea9aabeda5db4f90b00c84b6757d87500d6b51b68390276e8f86de6936f257ac1aedaeb13e9858c408d112a06e13baa1a8ce3b4eb57daec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ms \
tesseract-ocr-traineddata-malay \
tesseract-ocr-traineddata-msa \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-malay"

RDEPENDS:${PN} += ""

inherit rpm
