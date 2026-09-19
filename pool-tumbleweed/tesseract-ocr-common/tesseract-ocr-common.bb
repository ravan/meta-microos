SUMMARY = "Tesseract Open Source OCR Engine Common files"
DESCRIPTION = "This package contains files common to the Tesseract Open Source OCR \
Engine binaries and library."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.5.3"

RPM_NAME = "tesseract-ocr-common-5.5.3-1.1.noarch.rpm"
RPM_HASH = "eb1decb04bd4f366c455da57f52ec3df67aa811422d9e1c096d938de933a8e3c6739cb5d7ce1b7736c84c360cf1a901af385dc6a800c135763f50d692c5359d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-common"

RDEPENDS:${PN} += "tesseract-ocr-traineddata-provider"

inherit rpm
