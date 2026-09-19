SUMMARY = "Kannada language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kannada language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kan-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "363302082394cc2084e3909eaf568b353ed42d3b59f967a8aa4a8ad6316662c4b5b18846b68c357cccea1031f009980095095ae2e5bd317f13b18dcbd3506d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-kn \
tesseract-ocr-traineddata-kan \
tesseract-ocr-traineddata-kannada \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-kannada"

RDEPENDS:${PN} += ""

inherit rpm
