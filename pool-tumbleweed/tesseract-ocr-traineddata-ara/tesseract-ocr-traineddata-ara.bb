SUMMARY = "Arabic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Arabic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ara-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "593e3cc38ef6fd2040b5a25367bd79ef4f8f065c1a16601a388d11033a388eed61c2b5aa1c4d5b1ffd74d8d61b0b2f6c20202d72a29dd1f1c6f2c6142413a68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ar \
tesseract-ocr-traineddata-ara \
tesseract-ocr-traineddata-arabic \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-arabic"

RDEPENDS:${PN} += ""

inherit rpm
