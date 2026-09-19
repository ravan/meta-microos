SUMMARY = "Slovenian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Slovenian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-slv-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "7de2cb0c932cda0bca6bcc5f1418f069b1a9686acc42f6faa5e379c406076ec2639cdeac8b21204a3c70464b9a4a4abc62a9120d9381bedcd8f300d16dc69420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tesseract-ocr-common-sl \
tesseract-ocr-traineddata-provider \
tesseract-ocr-traineddata-slovenian \
tesseract-ocr-traineddata-slv \
tesseract-traineddata-slovenian"

RDEPENDS:${PN} += ""

inherit rpm
