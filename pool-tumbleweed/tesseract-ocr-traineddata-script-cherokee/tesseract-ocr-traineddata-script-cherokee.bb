SUMMARY = "Cherokee script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cherokee script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-cherokee-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "af750f570d60b5f7fa1b78e994474c8236bafe76164c4ed41cbe6a6fae3e792675f6011d99abc90737dddf525c7b4476a3a8c17a73ccfc134c40a0158ce549df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-cherokee"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
