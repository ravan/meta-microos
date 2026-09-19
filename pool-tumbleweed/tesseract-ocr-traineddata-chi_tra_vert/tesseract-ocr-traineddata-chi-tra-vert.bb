SUMMARY = "Chinese (Traditional, Vertical) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Traditional, Vertical) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-chi_tra_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d892d6f4cbd441f4f167bd7e4099f3f436fbca24f0b776686672d9a13f9f254a7c8f00258bb44bb728887dfd7e4113d3b8f71eb1af8afc0b2a35672d2ed46ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-zh-TW \
tesseract-ocr-traineddata-chi-tra-vert \
tesseract-ocr-traineddata-chinese-traditional-vertical \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-chinese-traditional-vertical"

RDEPENDS:${PN} += ""

inherit rpm
