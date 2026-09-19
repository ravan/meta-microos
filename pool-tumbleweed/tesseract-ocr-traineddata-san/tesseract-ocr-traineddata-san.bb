SUMMARY = "Sanskrit language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sanskrit language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-san-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2ddd0e543aea5e71ccbdfe67f8dc29169e8a8a008af9170ab997792e182f2c1f809e5cf5927ab509b9f574acda155b8d5a38ca1804799d203ac77a8e3e6e1195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sa \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-san \
tesseract-ocr-traineddata-sanskrit \
tesseract-traineddata-sanskrit"

RDEPENDS:${PN} += ""

inherit rpm
