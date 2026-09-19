SUMMARY = "Romanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Romanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ron-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b6f5382097c8446e96176b078e870175d7951c5a025d74c982494bdcce8423cdd86452493aa0944fd86e5e47706ce0a9ac66c439336fb7b5b2a59d84e4d9a84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ro \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-romanian \
tesseract-ocr-traineddata-ron \
tesseract-traineddata-romanian"

RDEPENDS:${PN} += ""

inherit rpm
