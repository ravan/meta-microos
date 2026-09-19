SUMMARY = "Documentation for texlive-utfsym"
DESCRIPTION = "This package includes the documentation for texlive-utfsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-doc-2026.226.0.0.9.0svn63076-60.2.noarch.rpm"
RPM_HASH = "bbb7cfca15c75635a08d0510e1657a080a1cb265c5d3678ae1cf624336ebe87f4138581b006d79e535d21a813926a5a79e0d906512f28ddc1e1d95981b6d7089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-utfsym-doc-de \
texlive-utfsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
