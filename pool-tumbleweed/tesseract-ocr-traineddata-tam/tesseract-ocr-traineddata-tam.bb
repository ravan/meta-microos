SUMMARY = "Tamil language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tamil language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tam-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "0ab88662c1aba8272397f4707e723d2f1678ddc4616c14ecc675d4a42c716d05b4862c5c9224293e34de2829af218c68d0a6ae88c95b304a6e214e6f37d09795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ta \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tam \
tesseract-ocr-traineddata-tamil \
tesseract-traineddata-tamil"

RDEPENDS:${PN} += ""

inherit rpm
