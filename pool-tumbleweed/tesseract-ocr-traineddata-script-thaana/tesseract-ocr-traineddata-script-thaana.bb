SUMMARY = "Thaana script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thaana script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-thaana-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "7a894579bc253616d8b5ce3610e50ff8838a99499a03ccacc3fcd965adef3540191a68421fb7e6f1700da4e356c27ed1732065f9c3a67e9d9f01e716189a33b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-thaana"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
