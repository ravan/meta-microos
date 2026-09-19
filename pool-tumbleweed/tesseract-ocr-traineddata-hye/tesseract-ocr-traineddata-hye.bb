SUMMARY = "Armenian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Armenian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-hye-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2ca38e7421a5749f93a04151d174bdd7bdff1250c1ca34d3e34f6681fea37afc005191a8c16ddcaad83ccabd952095ac9220ab5f2dde135f5d316ad0728d496c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-hy \
tesseract-ocr-traineddata-armenian \
tesseract-ocr-traineddata-hye \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-armenian"

RDEPENDS:${PN} += ""

inherit rpm
