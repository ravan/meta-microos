SUMMARY = "Korean language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Korean language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kor-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9e7d24bbc083e38fb93a5847e240b36ddc4403124b0de9d5f8fe59ecae6aba6d4aaa938c742d3ab107d5d943d1ed7cb52d09644188f2a77ad47852f69cb70c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ko \
tesseract-ocr-traineddata-kor \
tesseract-ocr-traineddata-korean \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-korean"

RDEPENDS:${PN} += ""

inherit rpm
