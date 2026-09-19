SUMMARY = "Sindhi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sindhi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-snd-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "c0130e74c9c412f3e8c8e02cf1744c1713514de795019632a5aef9c7cf6a46f9bb945934a3eb2a0a90d04d4c8a036831c18e89a41ca7741187d5643783f81463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sd \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-sindhi \
tesseract-ocr-traineddata-snd \
tesseract-traineddata-sindhi"

RDEPENDS:${PN} += ""

inherit rpm
