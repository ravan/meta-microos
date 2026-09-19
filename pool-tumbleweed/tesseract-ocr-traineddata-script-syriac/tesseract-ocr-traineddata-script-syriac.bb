SUMMARY = "Syriac script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Syriac script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-syriac-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "701db294e0e53259dea2c65979548793fd7cc49e61d2390c53a8b1885362fb11c9da3d6746426301d1d705390ba27053d789a48c31c5a2a91c0a2d6bc8abaf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-syriac"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
