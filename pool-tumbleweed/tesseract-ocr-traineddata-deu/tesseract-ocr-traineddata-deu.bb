SUMMARY = "German language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the German language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-deu-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "736514c1771626e5ab62b310eba2577af71541fa00acc0ad0fa53cb149584e92877089ab02877046b494f2afa9cc8a0d4a90ca1dab27b76812be6eb1e5aee366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-de \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-german \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-german"

RDEPENDS:${PN} += ""

inherit rpm
