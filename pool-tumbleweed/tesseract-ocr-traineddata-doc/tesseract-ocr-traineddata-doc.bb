SUMMARY = "Documentation for tesseract-ocr-traineddata"
DESCRIPTION = "The tesseract-ocr-traineddata-doc package contains the documentation for tesseract-ocr-traineddata."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20240801.8741641"

RPM_NAME = "tesseract-ocr-traineddata-doc-4.1.0+git.20240801.8741641-2.2.noarch.rpm"
RPM_HASH = "b46fe429472b1a2639242e79d306126a8d50ab3f71ffe9084c2f2c8620e84213f7c0750da4a11ee6d6fd24f7718702f00dcbf46d32f59d2ff46f9f7f36d7e69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-doc"

RDEPENDS:${PN} += ""

inherit rpm
