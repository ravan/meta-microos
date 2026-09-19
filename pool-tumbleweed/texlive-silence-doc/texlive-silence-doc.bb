SUMMARY = "Documentation for texlive-silence"
DESCRIPTION = "This package includes the documentation for texlive-silence"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5bsvn77682"

RPM_NAME = "texlive-silence-doc-2026.226.1.5bsvn77682-60.2.noarch.rpm"
RPM_HASH = "a6bc321e5b0e9ef673cac41cd626a86ebf084c562fdf1c6848c1f023a4b29570631a46a59efd583462ab8ef71624f6f7e60fc97a61f98a5b6999794ccf91c5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-silence-doc"

RDEPENDS:${PN} += ""

inherit rpm
