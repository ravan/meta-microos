SUMMARY = "Myanmar script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Myanmar script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-myanmar-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "703501bcc3f336e12d11572dd2e6339c28f2f7a5128ab99c110d8c0f04dcdc3b72c069fba707f29aadeb8d61e3504d3c1dd2700d11197df403b0351baa57741a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-myanmar"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
