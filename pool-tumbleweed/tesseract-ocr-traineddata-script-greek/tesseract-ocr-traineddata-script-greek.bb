SUMMARY = "Greek script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Greek script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-greek-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2e6ebe355bf8e22227e61ca14f3db1b3bc636be130cd6eaa6c98ee8ec03841ae8b6e44022a210b361d41941d75bd1638b30b563ca6327d9ba9b3e6d9ed61353c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-greek"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
