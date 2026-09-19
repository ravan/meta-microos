SUMMARY = "Orientation & Script Detection Data for tesseract"
DESCRIPTION = "Math equation data for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-equ-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fc599ca8198e67b0e16a7a2954a7e00a5d5dbfaa9fbe1bd15ccf24a228da47866fb57d06272d433024247a8c71befea5dad44db1ab06a5d7e755082347607f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-equ \
tesseract-ocr-traineddata-math-equation"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
