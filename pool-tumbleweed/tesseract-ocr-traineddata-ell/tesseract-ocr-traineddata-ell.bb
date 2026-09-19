SUMMARY = "Greek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Greek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ell-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "ac26a1592bef318c996535cac2b3847b2681c79767a6ca080bab6b7c5911e414956492786b7bcef103ad4928cf5a1a88896efe716cfbeb607f5d2c89d191f1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-el \
tesseract-ocr-traineddata-ell \
tesseract-ocr-traineddata-greek \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-greek"

RDEPENDS:${PN} += ""

inherit rpm
