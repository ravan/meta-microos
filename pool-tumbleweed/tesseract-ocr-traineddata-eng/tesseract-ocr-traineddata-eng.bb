SUMMARY = "English language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the English language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-eng-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fb2b4a4aa2fedbefcb503c19c7060a36cef0568ecbd37202e3d57c200f08d96dce22e9926cbc3be256436c409ddfbb8e39f89aeb276de0bb51f365da46d209c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-eng \
tesseract-ocr-traineddata-english \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-english"

RDEPENDS:${PN} += ""

inherit rpm
