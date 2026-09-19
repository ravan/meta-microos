SUMMARY = "Indonesian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Indonesian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ind-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c8dafb912329d29b66dff0f6e725ee08dfee7553d7654643aec68c5360dfafd6ee5d57707f13b80b76b5ec8e6dc87e4a2bff456f7647839d891866fe0a81963f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-id \
tesseract-ocr-traineddata-ind \
tesseract-ocr-traineddata-indonese \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-indonese"

RDEPENDS:${PN} += ""

inherit rpm
