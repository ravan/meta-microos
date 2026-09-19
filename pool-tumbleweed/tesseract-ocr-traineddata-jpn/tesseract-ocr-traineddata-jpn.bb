SUMMARY = "Japanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-jpn-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "7789758db9d7b19bb0f97e323c3bdad308839b75c5a167321dcebb092acc3ff76fb6c10fdd7feb4e31773349eea53e75960ae1e16d1e47a6db05d2dc2b52dcfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ja \
tesseract-ocr-traineddata-japanese \
tesseract-ocr-traineddata-jpn \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-japanese"

RDEPENDS:${PN} += ""

inherit rpm
