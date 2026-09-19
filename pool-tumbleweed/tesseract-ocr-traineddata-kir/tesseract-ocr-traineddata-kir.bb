SUMMARY = "Kyrgyz language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kyrgyz language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kir-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "41cb345e5a5276e4054f3c782dced1cc96ebfaffff99c4a9626d44e3cfad8b9bfbc69d551033f98948cea340438c5fdab64b3b88ff64067ef28be746287e40a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ky \
tesseract-ocr-traineddata-kir \
tesseract-ocr-traineddata-kyrgyz \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-kyrgyz"

RDEPENDS:${PN} += ""

inherit rpm
