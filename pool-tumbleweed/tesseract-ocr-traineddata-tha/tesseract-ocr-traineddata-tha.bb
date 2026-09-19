SUMMARY = "Thai language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thai language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tha-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "23a58285e429b9b42c3b6209e16e58b2b45443ecb2882c5df345545aeab2db6216dfa6928b11b795f466b33207634585decc1d7814f69bf6ad5086a9ff08e38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-th \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tha \
tesseract-ocr-traineddata-thai \
tesseract-traineddata-thai"

RDEPENDS:${PN} += ""

inherit rpm
