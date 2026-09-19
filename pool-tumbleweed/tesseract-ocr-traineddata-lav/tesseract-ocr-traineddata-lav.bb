SUMMARY = "Latvian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latvian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-lav-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "28e403a0f90e0ab7033f0120ef0f26f21ee60386fcd6d2008b4635375665c0b5bd0cd831bc264db9156142212fe6b596b6fac9a16fdcb2262a9143cb098dca2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-lv \
tesseract-ocr-traineddata-latvian \
tesseract-ocr-traineddata-lav \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-latvian"

RDEPENDS:${PN} += ""

inherit rpm
