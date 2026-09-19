SUMMARY = "Pashto language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Pashto language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-pus-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c57086f19bb1737dff9dc2bf3960d467fc0b1036f81b52d9bd4c05dfbbd1f7554f4848c6d8c6f8e39675833ee7ea5be5e17a58330b73fd7a61a68a11def18609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ps \
tesseract-ocr-traineddata-pashto \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-pus \
tesseract-traineddata-pashto"

RDEPENDS:${PN} += ""

inherit rpm
