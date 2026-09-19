SUMMARY = "Uzbek (Cyrillic) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uzbek (Cyrillic) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-uzb_cyrl-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "582cfda6dbff98e544f574e9611d9de5d283c56427b38dfb7ab6830c6cc41650da1f66eb4412fed3edfeb5c987196367f0aaf49decd09797a549b7ef0fcf08bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-uzb-cyrl \
tesseract-ocr-traineddata-uzbek-cyrillic \
tesseract-traineddata-uzbek-cyrillic"

RDEPENDS:${PN} += ""

inherit rpm
