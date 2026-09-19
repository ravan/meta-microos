SUMMARY = "Persian (Farsi) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Persian (Farsi) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fas-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "17689d9ed4350597cb40acd7a8348d51e198d89ab1695813bcc3ff09aa86222a5087ebfca1558ba81513ddb006b3e8701dc1f2723b30c4ee12653a0c6d1029aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-fa \
tesseract-ocr-traineddata-fas \
tesseract-ocr-traineddata-persian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-persian"

RDEPENDS:${PN} += ""

inherit rpm
