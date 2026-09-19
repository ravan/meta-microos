SUMMARY = "Hebrew script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hebrew script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hebrew-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b8cd333c1c04a5de4828c3f3d5d74c046bcd306cdf31cd6798205f09f02681f8f9e59cabfde787d29edfbaed824b48d0246e85dcea468885a3aa4c191b23d54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hebrew"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
