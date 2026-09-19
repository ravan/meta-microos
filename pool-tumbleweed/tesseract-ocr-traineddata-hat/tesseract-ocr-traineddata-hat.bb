SUMMARY = "Haitian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Haitian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-hat-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "aab7641f9b06cde586bffaf88362504e34479592a6e0e9c9bf5ba705d488ebcf1a7cc1a6586d041aa5bbd647be75a14a3203ab1fe4e49560c76688c6df09c798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ht \
tesseract-ocr-traineddata-haitian \
tesseract-ocr-traineddata-hat \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-haitian"

RDEPENDS:${PN} += ""

inherit rpm
