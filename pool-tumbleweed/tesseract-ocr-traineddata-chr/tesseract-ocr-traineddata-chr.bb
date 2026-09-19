SUMMARY = "Cherokee language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cherokee language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-chr-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1375e82bea71e7ce43edcc6938160849535649b6817b96cd3ef0bac76babb567966ab86a2abd73e50b8a16e35367a1957b439443d06211634dbacbad95323a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-cherokee \
tesseract-ocr-traineddata-chr \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-cherokee"

RDEPENDS:${PN} += ""

inherit rpm
