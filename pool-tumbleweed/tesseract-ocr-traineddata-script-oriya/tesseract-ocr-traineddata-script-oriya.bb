SUMMARY = "Oriya script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Oriya script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-oriya-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "4ace3299635964dcc31a84eabf3e78e2f86fc48467701d5c945a06e464c084c1316e0ab4b78a893757e6eea34ce994619ab8bdb3d8196c5a307aee060295e528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-oriya"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
