SUMMARY = "Han (Traditional) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Traditional) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hant-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "e7ad649205f0f9bb0a2eacbc2cde2a41f17694dda15b216b812cf350032fc2c31706e606c1112382b5f8beb834e72567fd016f222a9af344be95dcb392799284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hant"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
