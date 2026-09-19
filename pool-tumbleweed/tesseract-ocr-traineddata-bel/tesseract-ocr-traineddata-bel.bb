SUMMARY = "Belarusian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Belarusian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-bel-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "611975a232280ef55f54b3969558ef43be183d56b4edf37ba739610217cfa3358ea7e8728abaed17b440025f70eb00e2a9d22fe6baf8113716ef3e140d145f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-bel \
tesseract-ocr-traineddata-bel \
tesseract-ocr-traineddata-belarusian \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-belarusian"

RDEPENDS:${PN} += ""

inherit rpm
