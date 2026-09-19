SUMMARY = "Irish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Irish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-gle-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "72b577b560a86e638726e33fda3f9e612c748dc02101476b46a2eb92143a274bb4874005803c8a5747670b4f437a6ffbbebd94f4b6bda90454ae4003d1f98250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ga \
tesseract-ocr-traineddata-gle \
tesseract-ocr-traineddata-irish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-irish"

RDEPENDS:${PN} += ""

inherit rpm
