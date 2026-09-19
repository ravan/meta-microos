SUMMARY = "Ukrainian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ukrainian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ukr-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "d55dda9fa92966f0a87d79c79693091115d6a711384acb526fa2db7dc065d586fbaf2966053bc1f7f6c1b3f36a7c53f0ef398594790bf8ce9a339fdfce1847bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-uk \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-ukr \
tesseract-ocr-traineddata-ukrainian \
tesseract-traineddata-ukrainian"

RDEPENDS:${PN} += ""

inherit rpm
