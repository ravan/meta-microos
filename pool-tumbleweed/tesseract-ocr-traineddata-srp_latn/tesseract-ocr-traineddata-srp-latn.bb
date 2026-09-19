SUMMARY = "Serbian (Latin) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Serbian (Latin) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-srp_latn-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "8087387f1a1188ee512a5d796e377d5f57f01e55dd92f5fa17c1037fad3a4f9dc9a6dd3849bf55c6d5eed2a8d239e462cbb3eea52c9fdaef19aea617daa4a2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-serbian-latin \
tesseract-ocr-traineddata-srp-latn \
tesseract-traineddata-serbian-latin"

RDEPENDS:${PN} += ""

inherit rpm
