SUMMARY = "Corsican language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Corsican language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-cos-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1e71777df64503f516038c9702feec4250f280e3094fc3abb63752dd58761e04882d7708a40b50d922fe1fdf0846c79d5f63a4e87e71ed4d65d1963b7cb098f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-co \
tesseract-ocr-traineddata-corsican \
tesseract-ocr-traineddata-cos \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-corsican"

RDEPENDS:${PN} += ""

inherit rpm
