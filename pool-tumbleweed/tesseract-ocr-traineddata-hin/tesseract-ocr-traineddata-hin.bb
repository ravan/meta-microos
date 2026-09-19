SUMMARY = "Hindi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hindi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-hin-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a3e167228247da0fc2818fa4102e2891f17bb7467c51f33e545d49b1c1a17a4fcc53895153c70387b32248273c86275d45f14518135315e1bcfb579f87f29214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-hi \
tesseract-ocr-traineddata-hin \
tesseract-ocr-traineddata-hindi \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-hindi"

RDEPENDS:${PN} += ""

inherit rpm
