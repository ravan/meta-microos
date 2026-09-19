SUMMARY = "Italian (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Italian (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-ita_old-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b16bffe0715cfbf11c30d43546ac14a74b08cceee286cd29b6d0be50363b090eff43b411f4ed312b29ac3df6a49904017192be47649c09040da1962635ca768c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ita-old \
tesseract-ocr-traineddata-italian-old \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-italian-old"

RDEPENDS:${PN} += ""

inherit rpm
