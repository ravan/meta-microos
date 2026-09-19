SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2026.20260301.svn15093-120.4.aarch64.rpm"
RPM_HASH = "85f48b9b5467ab5022e88be6165504deccf2b882509a440dadbfb74b0c4b65e869e80a14de43ebe6ab0ebd44e5d489c4b0a279702b2c6146209c0ecc1df16527"

RPROVIDES:${PN} += "texlive-listings-ext-bin"

RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
