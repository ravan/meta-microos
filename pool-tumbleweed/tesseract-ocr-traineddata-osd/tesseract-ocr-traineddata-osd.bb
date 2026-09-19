SUMMARY = "Orientation & Script Detection Data for tesseract"
DESCRIPTION = "Orientation & Script Detection data for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-osd-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fc8346f8486fbc4e5277e10ee3d8fc8d67de363be64cd9d005042c952210c349f11a916a55a3392d7def7a579a234c91ad302c281ae1028905d5a54ce4f14539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-orientation-and-script-detection \
tesseract-ocr-traineddata-osd"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
