SUMMARY = "Filipino; Pilipino language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Filipino; Pilipino language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fil-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "fc2ad6944ef31baa18e63cab015a56b5b46e68762fb640bb7bfdc01e5e94f38728c384a42d2d22f428c0ea6fa94738a555f5d2795e34900d949b90294b21ddb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fil \
tesseract-ocr-traineddata-filipino \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-filipino"

RDEPENDS:${PN} += ""

inherit rpm
