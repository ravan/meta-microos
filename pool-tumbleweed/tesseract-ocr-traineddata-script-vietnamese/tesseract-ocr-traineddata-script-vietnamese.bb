SUMMARY = "Vietnamese script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Vietnamese script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-script-vietnamese-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "180bb3a5849fca981bf7d6e9129344ff5aaa6ff8036caa96efa1d9f7c2b60cf194f9ba8614f4d04b28f09ac69ad7e5407b148fc184b3880893f7355ef0eb5951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-vietnamese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
