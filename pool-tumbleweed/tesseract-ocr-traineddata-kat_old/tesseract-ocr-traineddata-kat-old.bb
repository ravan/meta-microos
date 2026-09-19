SUMMARY = "Georgian (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kat_old-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "457a6f61342e5eacae5f4d9ebfd16fea8ad4dc3b5b12f3ddfdeb3308f0c5c57c53b2610dedde820f9cf971a13b0dd41dc54e83b0646767aa9f0ee61e063dff18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-georgian-old \
tesseract-ocr-traineddata-kat-old \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-georgian-old"

RDEPENDS:${PN} += ""

inherit rpm
