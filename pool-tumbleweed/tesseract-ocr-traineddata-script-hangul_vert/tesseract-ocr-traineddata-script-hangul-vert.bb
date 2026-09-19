SUMMARY = "Hangul (Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hangul (Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-hangul_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "aa48d31ccb331cdf3bec57d9294cb04e2231d78e7fb189281f575ddba3c779804224865850efe97bae386d78248f26742bb8c7b761348886fe364f65f3760403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hangul-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
