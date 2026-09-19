SUMMARY = "Uyghur language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uyghur language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-uig-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "1e60c6244605858adaf4981ce332a9f9bcf723a09ab983d1cd949563ae47b17b2cf079e58b8823a21cbd7ee9afaf0d05e87360dc9a05c723bd31e5623a0a1f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-ug \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-uig \
tesseract-ocr-traineddata-uyghur \
tesseract-traineddata-uyghur"

RDEPENDS:${PN} += ""

inherit rpm
