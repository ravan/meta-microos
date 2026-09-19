SUMMARY = "Japanese script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-japanese-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "f9a2decfcfac3fa4e1c444fdddaecea66686fa880fb742e1a2fc67feac9f9b3ad55e4195f6772aba2d4c2e36224a66b7df510e5f600db3267d47f3a04ce68a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-japanese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
