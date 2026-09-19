SUMMARY = "Documentation for texlive-abstyles"
DESCRIPTION = "This package includes the documentation for texlive-abstyles"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-abstyles-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "6dd2a0dd8a4d3d3438c73d0a20e5d242703b081a8a405110dab745c49fecfe600c6752707c98d7a02b887767560fbc281df90a5ab4765fbf90de5f1f44682b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abstyles-doc-de \
texlive-abstyles-doc"

RDEPENDS:${PN} += ""

inherit rpm
