SUMMARY = "Georgian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kat-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "aadaadbdecd1d6fa7b106303ade9bf23fed8d905e662c0bf33b15fb1f2f1afc61cdf3580f5bb00a10b8820ece39ed65b3ddeee1ebc5ea475bd0f40de8bf391c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ka \
tesseract-ocr-traineddata-georgian \
tesseract-ocr-traineddata-kat \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-georgian"

RDEPENDS:${PN} += ""

inherit rpm
