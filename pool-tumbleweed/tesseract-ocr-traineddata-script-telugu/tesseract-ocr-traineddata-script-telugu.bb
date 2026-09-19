SUMMARY = "Telugu script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Telugu script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-telugu-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "451376b509a22be0f93f28de434760473869fde98c11e3a8e9b949222de4d96efd1e21b046cb4c37fa8b3e8e3cecd2ee01c3bc035682529d3b4574e2b19910e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-telugu"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
