SUMMARY = "Chinese (Simplified, Vertical) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Simplified, Vertical) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-chi_sim_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "770bd1d69636edd004e14fa45792015a9fa577a78d4c9a9321e8a89e053db74f1014a14a412993fb5c5bced0db90d84345c749d913575c585db9f835dd34aa25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-zh-CN \
tesseract-ocr-traineddata-chi-sim-vert \
tesseract-ocr-traineddata-chinese-simplified-vertical \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-chinese-simplified-vertical"

RDEPENDS:${PN} += ""

inherit rpm
