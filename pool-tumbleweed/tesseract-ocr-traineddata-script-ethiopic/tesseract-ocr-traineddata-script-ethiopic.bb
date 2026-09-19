SUMMARY = "Ethiopic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ethiopic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-ethiopic-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "669fe0d5be302fdccd5f904edaa8c0bf1a5b9b5d521caf1c664f82207e1240fbb2dedf3ff8198bcd539ecf51169082eeb46ca849630e056c4d3efc49de629dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-ethiopic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
