SUMMARY = "Luxembourgish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Luxembourgish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ltz-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fa56ce63df8bb37d0f2d0e4621496de61a36bc1c9bea3117f3873d52ea1d67fe2dcf5e28116fe6c00b167c7a389af6f6bd8c3171b9c0d9c3fabd72f50067f502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-lb \
tesseract-ocr-traineddata-ltz \
tesseract-ocr-traineddata-luxembourgish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-luxembourgish"

RDEPENDS:${PN} += ""

inherit rpm
