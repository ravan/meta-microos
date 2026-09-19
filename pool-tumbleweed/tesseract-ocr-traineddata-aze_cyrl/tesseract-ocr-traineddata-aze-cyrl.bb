SUMMARY = "Azerbaijani (Cyrillic) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Azerbaijani (Cyrillic) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-aze_cyrl-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "df186e800e9614dd1036ed69a528f873e183cae47a7f4dc7541cbac06ea884c36cb967e974524e938a38d66886ec0ae8c761851071d6760563cc48d284a8b116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-aze-cyrl \
tesseract-ocr-traineddata-azerbaijani-cyrillic \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-azerbaijani-cyrillic"

RDEPENDS:${PN} += ""

inherit rpm
