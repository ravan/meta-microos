SUMMARY = "Armenian script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Armenian script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-armenian-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "451df066d54d98ff90fb29dc6c77e8bb23e5eed64c6a157cc262118c023709e24432a85292ac5053900ceed4af6ec1199c6e4f92b961af57ab0fa2c6b99c2a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-armenian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
