SUMMARY = "Portuguese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Portuguese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-por-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "5a45ec5cd969c281673766c315d3d7f46a53ffcd6fc192467cbffdbeef897ec8a3ea84c26c7ea661e1d9a645bd055c99630686ffb3c6a37ce2f790a59d0210ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-pt \
tesseract-ocr-traineddata-por \
tesseract-ocr-traineddata-portuguese \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-portuguese"

RDEPENDS:${PN} += ""

inherit rpm
