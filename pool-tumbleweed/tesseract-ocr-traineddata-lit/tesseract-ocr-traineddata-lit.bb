SUMMARY = "Lithuanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lithuanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-lit-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d8f74535e07a453399f8e8e22b5f38762cf2b5538dda961e20275279f57aa445af8ddd6f82f35fe466fe3abe8b67bbf3ed254677d0a4a73d33e5f5d6a7c9b15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-lt \
tesseract-ocr-traineddata-lit \
tesseract-ocr-traineddata-lithuanian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-lithuanian"

RDEPENDS:${PN} += ""

inherit rpm
