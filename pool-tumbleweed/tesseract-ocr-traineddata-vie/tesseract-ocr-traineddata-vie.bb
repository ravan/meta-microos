SUMMARY = "Vietnamese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Vietnamese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-vie-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "abdca864524d28662395254c190911fb4ea9b228081c9bdfc95f1b55357251e49303a066ec737f5cb3a1dbf7c7085f531fde7e7ba174c1d920754a5c97700f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-vi \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-vie \
tesseract-ocr-traineddata-vietnamese \
tesseract-traineddata-vietnamese"

RDEPENDS:${PN} += ""

inherit rpm
