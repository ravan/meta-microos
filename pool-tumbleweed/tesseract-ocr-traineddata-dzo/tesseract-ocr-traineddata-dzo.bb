SUMMARY = "Dzongkha language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dzongkha language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-dzo-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "bbf9f4501b80d55ba8e52b5d9a5573b2a4e466b40dcf5989df46d4f3d5376d7c201dd8838cbeece3185c6bdf98e552cd958b779c83d9c6f5a9543c9e182b710a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-dzo \
tesseract-ocr-traineddata-dzongkha \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-dzongkha"

RDEPENDS:${PN} += ""

inherit rpm
