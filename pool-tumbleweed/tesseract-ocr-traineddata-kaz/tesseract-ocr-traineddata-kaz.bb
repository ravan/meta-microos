SUMMARY = "Kazakh language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kazakh language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kaz-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "037fdbb7a353958291c6326252bf686da2b93aed5f5033aba791a3335ff85012163182da07e62456ad3aee60d5ca8d354bd3598023e9f6b65f8d77ce391ddc8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-kk \
tesseract-ocr-traineddata-kaz \
tesseract-ocr-traineddata-kazakh \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-kazakh"

RDEPENDS:${PN} += ""

inherit rpm
