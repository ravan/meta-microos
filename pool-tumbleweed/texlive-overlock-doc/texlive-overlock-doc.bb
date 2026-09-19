SUMMARY = "Documentation for texlive-overlock"
DESCRIPTION = "This package includes the documentation for texlive-overlock"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-overlock-doc-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "ca250841c0976fc501001d2ce0d6d124a33baf58a0eb7228b52afbd6a4fb215c2fdf9871780166de163909080efc5c6ed4dac957bc5db4b28e0d7fae4699386f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlock-doc"

RDEPENDS:${PN} += ""

inherit rpm
