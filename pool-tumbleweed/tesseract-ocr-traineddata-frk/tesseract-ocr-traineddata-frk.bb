SUMMARY = "Fraktur language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Fraktur language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-frk-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "dd1917d31dd6a8b6f7ac38bc7dc713dc54cbed9e6ea38197a40d4cd7d53c1a95032e41c2163211773acabe7d5bf0bcdad43863c5e1e9b6437c70a54bf22883c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-frankish \
tesseract-ocr-traineddata-frk \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-frankish"

RDEPENDS:${PN} += ""

inherit rpm
