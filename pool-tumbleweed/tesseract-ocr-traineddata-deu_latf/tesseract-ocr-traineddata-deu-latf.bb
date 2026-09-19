SUMMARY = "Fraktur language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Fraktur language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-deu_latf-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "2547a3640d064f7c8559c9e2af50c8fa095e339ff2df944a4dfd8c978f9298e3d4468536df649e61e1ec7be14848293036b17b2bf10d2f9558ee52b6036ce05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-deu-latf \
tesseract-ocr-traineddata-frankish \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-frankish"

RDEPENDS:${PN} += ""

inherit rpm
