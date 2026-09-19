SUMMARY = "Occitan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Occitan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-oci-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a850434aa89a5abd0a3149590a304ea7ab1deac5a2a14a1ae6fd78f075678bc7447ef8b13f785b71a889952c841f44b949db852d4044db511dfaf899c475f7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-oc \
tesseract-ocr-traineddata-occitan \
tesseract-ocr-traineddata-oci \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-occitan"

RDEPENDS:${PN} += ""

inherit rpm
