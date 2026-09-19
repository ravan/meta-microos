SUMMARY = "Kannada script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kannada script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-kannada-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "4bd989cccff090f9b8ca64bbe218f44761be4e598b1f9f72642615701996afe3099b6905db47955264a22170f81bf46a5e78777f3fd0b7e6c4cc731d3628112e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-kannada"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
