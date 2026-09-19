SUMMARY = "Chinese (Simplified) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Simplified) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-chi_sim-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "32a0fefbc6fefb025c5c37ac0839d690eedf850835d0cd74e81ac866d907ae810523f0c2f14600b9a813857bbc3f9513d5edc9b1312d86eeafd7f2c4df40f287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-zh-CN \
tesseract-ocr-traineddata-chi-sim \
tesseract-ocr-traineddata-chinese-simplified \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-chinese-simplified"

RDEPENDS:${PN} += ""

inherit rpm
