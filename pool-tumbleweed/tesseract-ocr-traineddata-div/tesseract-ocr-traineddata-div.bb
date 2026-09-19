SUMMARY = "Dhivehi; Maldivian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dhivehi; Maldivian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-div-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fd351c57c130831dab2773d2f682db06ba7dd19180e2821cabe2e533d355ccc951430def0d821dbd73a6daac89fe41954efbe556d3abaf7fbe4d7f7485fdb4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-dv \
tesseract-ocr-traineddata-dhivehi \
tesseract-ocr-traineddata-div \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-dhivehi"

RDEPENDS:${PN} += ""

inherit rpm
