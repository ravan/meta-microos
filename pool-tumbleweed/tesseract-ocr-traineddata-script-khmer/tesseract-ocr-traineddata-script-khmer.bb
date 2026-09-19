SUMMARY = "Khmer script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Khmer script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-khmer-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6607ebd2cb3078de538f065acfe1a9e6468d7019865253d38c96edb36f774e99cdb6b4b7224698c0a36a7bd8a02d708228e654cf936e278e554692fb7cdea559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-khmer"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
