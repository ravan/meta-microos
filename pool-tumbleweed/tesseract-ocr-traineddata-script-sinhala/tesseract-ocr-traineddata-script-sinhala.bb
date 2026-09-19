SUMMARY = "Sinhala script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sinhala script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-sinhala-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "f81c24f867a6822b2b75990b930c5f9613e85fe762d9dc7fbf163a9ea7f95b61e5595c4b3c16d42ceff3024f79527b03b7cf1e2413c4392919d9e3b15f615cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-sinhala"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
