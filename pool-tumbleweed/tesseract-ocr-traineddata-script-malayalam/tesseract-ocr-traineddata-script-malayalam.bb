SUMMARY = "Malayalam script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malayalam script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-malayalam-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6ca26f02db09cbf2fb851cd71559c46854b5c5e27324c1ce344e11edb299c740ebca08fea3ab164cfd55a5e83252bd5e2ce94a7448f083648b254c640fee899f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-malayalam"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
