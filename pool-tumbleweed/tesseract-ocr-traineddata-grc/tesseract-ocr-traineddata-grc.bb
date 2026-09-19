SUMMARY = "Ancient Greek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ancient Greek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-grc-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "3195ed700e0fd478398c24e20877fd89765dce9878287993098cd712a86417c89b5b087e96263216962a6ea78de82c608a68165df5a1f46e3910cdd62a0df92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-grc \
tesseract-ocr-traineddata-greek-ancient \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-greek-ancient"

RDEPENDS:${PN} += ""

inherit rpm
