SUMMARY = "Slovakian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Slovakian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-slk-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "9716e5b7e84396658062c0d005bf65026ed77f567ebdfff90aa15946c4dbe7e223a26b02802f90a56347a759244d306e93477bd3f210048998a230363085fe96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sk \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-slk \
tesseract-ocr-traineddata-slovak \
tesseract-traineddata-slovak"

RDEPENDS:${PN} += ""

inherit rpm
