SUMMARY = "'Korean language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the 'Korean language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-kor_vert-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "ccc4e36b40c3427573dad889e1c2fd65f6f8c229e857c8dcfde49b813faad706881d51c2862412eeee1a3987239732039e3842dc67db544ac0b05dc576533b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ko \
tesseract-ocr-traineddata-kor-vert \
tesseract-ocr-traineddata-korean-vertical \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-korean-vertical"

RDEPENDS:${PN} += ""

inherit rpm
