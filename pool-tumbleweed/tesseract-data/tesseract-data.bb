SUMMARY = "Data files for Tesseract"
DESCRIPTION = "This package provides the data files for the Tesseract game."
LICENSE = "Zlib"

PV = "2024_06_15"

RPM_NAME = "tesseract-data-2024_06_15-2.1.noarch.rpm"
RPM_HASH = "745351ffe3360275597621eb03af05d6da0aee4a5e51b0a92e2b71d05e2e095b774a0eca2a8ce0e7d3f82499cd1a63577fa7a6fee8f4b943cca62780f5b47a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-data"

RDEPENDS:${PN} += "tesseract"

inherit rpm
