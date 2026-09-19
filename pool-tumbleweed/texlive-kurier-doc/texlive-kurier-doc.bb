SUMMARY = "Documentation for texlive-kurier"
DESCRIPTION = "This package includes the documentation for texlive-kurier"
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.995bsvn77682"

RPM_NAME = "texlive-kurier-doc-2026.226.0.0.995bsvn77682-63.2.noarch.rpm"
RPM_HASH = "1e7e976e08c236d08ba6ac570615226d0e5a70ce24296cd95c8f1dce80817d12e9da4d4f41ff749d76a731c2b4f556c7e75f8aaba38c88faeb901511e835906d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kurier-doc-en;pl \
texlive-kurier-doc"

RDEPENDS:${PN} += ""

inherit rpm
