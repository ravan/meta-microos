SUMMARY = "Middle French (ca. 1400-1600) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Middle French (ca. 1400-1600) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-frm-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "8dd4a4b8cb06e99b358ec212bd4cb315ba9092364813998b0f0a9b545796236cad7666ab6a03e75ad7a93ac1beb6cf8cb7e30844af69cf9a19040d2b8c392e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-french-middle \
tesseract-ocr-traineddata-frm \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-french-middle"

RDEPENDS:${PN} += ""

inherit rpm
