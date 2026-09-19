SUMMARY = "Urdu language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Urdu language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-urd-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2ace1d1180adfb005f4cadf1048140f6998802e218dfc03aeafc18293a27357d07b8ff8d8923537e540650b083a6c14633fcc4e3ecc8d65bc88ab38e1a772822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ur \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-urd \
tesseract-ocr-traineddata-urdu \
tesseract-traineddata-urdu"

RDEPENDS:${PN} += ""

inherit rpm
