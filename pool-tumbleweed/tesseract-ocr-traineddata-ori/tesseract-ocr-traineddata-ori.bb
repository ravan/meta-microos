SUMMARY = "Oriya language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Oriya language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ori-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "23adb15b4f8d935f1885a22a7453247c6355b3d79325470fa905b8079deaaa5322e35e9b76b2c031d46cf5b6e45f376fb1ec1eae616b7ebb12eeab996a1369fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-or \
tesseract-ocr-traineddata-ori \
tesseract-ocr-traineddata-oriya \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-oriya"

RDEPENDS:${PN} += ""

inherit rpm
