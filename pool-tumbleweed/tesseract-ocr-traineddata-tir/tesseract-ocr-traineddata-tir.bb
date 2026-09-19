SUMMARY = "Tigrinya language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tigrinya language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-tir-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "6f4e5dfc57c04a11d240b824c88cd905b8f58c00439f6b4c94b3cabd4274774ae5fdd08dea9ac754dcf6efe5fcec4112eeb7af1f8322f622c3f1621a3546b04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ti \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-tigrinya \
tesseract-ocr-traineddata-tir \
tesseract-traineddata-tigrinya"

RDEPENDS:${PN} += ""

inherit rpm
