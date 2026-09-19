SUMMARY = "Western Frisian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Western Frisian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-fry-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "a6f6e612b0315b0635b93acb3d882aa702879882807cea8a92b0d7de2200eff617cbce548a6bb0b0737b3c998210701577c453a98a13e4498414269bc8bd29e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-fy \
tesseract-ocr-traineddata-frisian \
tesseract-ocr-traineddata-fry \
tesseract-ocr-traineddata-provider \
tesseract-traineddata-frisian"

RDEPENDS:${PN} += ""

inherit rpm
