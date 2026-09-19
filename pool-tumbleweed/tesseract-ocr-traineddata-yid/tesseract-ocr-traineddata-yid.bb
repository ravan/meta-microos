SUMMARY = "Yiddish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Yiddish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-yid-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "3efd58d0b4be1c708eeb98f77732a8a621fce6d926c75b6677fab4fb4b6ef07b9d0acad4b85da1cd6cac3d561ea34675ed1f5f5aa2258a6d9e3a5955c46a7ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-yi \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-yid \
tesseract-ocr-traineddata-yiddish \
tesseract-traineddata-yiddish"

RDEPENDS:${PN} += ""

inherit rpm
