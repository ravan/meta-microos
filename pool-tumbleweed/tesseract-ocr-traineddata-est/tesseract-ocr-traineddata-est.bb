SUMMARY = "Estonian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Estonian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-est-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fe2d2f565bdb882e3210356a44237d35a7bddc424634663e5b29e2044fdf11537c28f672ff066f22adc9d2471a79850dec66f1aaddfc5473c1ce010cb1e41f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-et \
tesseract-ocr-traineddata-est \
tesseract-ocr-traineddata-estonian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-estonian"

RDEPENDS:${PN} += ""

inherit rpm
