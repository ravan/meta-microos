SUMMARY = "Fraktur script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Fraktur script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-fraktur-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "62e780bc4ddfdc0cad7ba45bf5b94d7b75d8fc3140d52d2f2431659976d2925dcab44d951a140752f7e3d2b108658e931f37cfc9669bd4aadab16bcb82e8f19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-fraktur"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
