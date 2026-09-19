SUMMARY = "Sundanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sundanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-sun-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "35e218801b5093402efc0f66462313a09824a83539349999abaf1c5bbbd7a1541f437978bb06b1a6180ead13a52406948e79a45bc86b6bfd7192a270ec533c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-su \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-sun \
tesseract-ocr-traineddata-sundanese \
tesseract-traineddata-sundanese"

RDEPENDS:${PN} += ""

inherit rpm
