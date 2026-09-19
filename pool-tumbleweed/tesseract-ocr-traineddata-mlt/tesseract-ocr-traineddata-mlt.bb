SUMMARY = "Maltese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Maltese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-mlt-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "e4ac4936815a4a146ed7108b2587e52b2190ab760cb953565009bd9260b74f7abfd312eb50e1c21cbf7c504061626fef0e54a9dba79daad00b0a7f73740660c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-mt \
tesseract-ocr-traineddata-maltese \
tesseract-ocr-traineddata-mlt \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-maltese"

RDEPENDS:${PN} += ""

inherit rpm
