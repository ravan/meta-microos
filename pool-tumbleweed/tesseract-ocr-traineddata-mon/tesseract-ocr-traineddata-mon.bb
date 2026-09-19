SUMMARY = "Mongolian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Mongolian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mon-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d61b03931a7c218f0d37b1cf6f39f468000e40f458389d72533f8b408fd7badfeab740a96410fea359edcefa043fd232e93ee56083f12ddd901de255e63e5816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-mn \
tesseract-ocr-traineddata-mon \
tesseract-ocr-traineddata-mongolian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-mongolian"

RDEPENDS:${PN} += ""

inherit rpm
