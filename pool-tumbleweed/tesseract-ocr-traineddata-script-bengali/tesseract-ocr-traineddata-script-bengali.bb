SUMMARY = "Bengali script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bengali script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-bengali-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c4bc15fda636e89f49a930760e3bdc2a12a8dc62750e87211894f192ce8307db972abb6305e0d8595b28e2a4507535fcaa40895bcb3f6db53d224dbdc1e84685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-bengali"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
