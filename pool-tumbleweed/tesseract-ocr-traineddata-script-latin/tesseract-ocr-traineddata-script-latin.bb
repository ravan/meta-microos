SUMMARY = "Latin script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latin script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-latin-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9077886a4a82e1fb6aca396980f59d1a7bbdc005191042cbc859b525db90769b26381787e96c165591d5445228288ed98a12115f45602b6319ba3cd741757257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-latin"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
