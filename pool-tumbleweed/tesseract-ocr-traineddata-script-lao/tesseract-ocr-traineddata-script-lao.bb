SUMMARY = "Lao script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lao script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-lao-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "52deecfed5b86c899b2b177f2a819e05199b2c875af05861f77974886cf84d8a9c6fabffc1d8c2ceada3603df9c96c62b1f6ff3471b52a1b83bb7d2984c3ae29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-lao"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
