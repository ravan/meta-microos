SUMMARY = "Azerbaijani language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Azerbaijani language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-aze-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "26f3d1be55e87fa53a872ce441818dec92dc6f5e076c68758be9f7ae02b3b9d282e3f1d91b75f25cd2edea9079b5ecc89fc65cf5d337cb1ef4f28e13f95f4e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-az \
tesseract-ocr-traineddata-aze \
tesseract-ocr-traineddata-azerbaijani \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-azerbaijani"

RDEPENDS:${PN} += ""

inherit rpm
