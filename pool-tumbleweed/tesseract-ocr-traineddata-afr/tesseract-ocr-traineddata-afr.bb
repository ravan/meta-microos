SUMMARY = "Afrikaans language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Afrikaans language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-afr-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b14bf8690ab92a822c18b34b70976610a7d0754ec0dea9139cd249209056747904df980ebda45ba70217bea21871329b0c5317595c414267117b732f224f3e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-af \
tesseract-ocr-traineddata-afr \
tesseract-ocr-traineddata-afrikaans \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-afrikaans"

RDEPENDS:${PN} += ""

inherit rpm
