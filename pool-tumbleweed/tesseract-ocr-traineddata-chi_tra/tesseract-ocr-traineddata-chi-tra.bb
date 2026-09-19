SUMMARY = "Chinese (Traditional) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Traditional) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-chi_tra-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "5a7b38142ca890becdbdfbee1700aff4cecbce227fe40137019bd7b715e54e90bd100c56ba021678da6a27bf3e3e9ce1cacbf38768271786d2863b06e016041a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-zh-TW \
tesseract-ocr-traineddata-chi-tra \
tesseract-ocr-traineddata-chinese-traditional \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-chinese-traditional"

RDEPENDS:${PN} += ""

inherit rpm
