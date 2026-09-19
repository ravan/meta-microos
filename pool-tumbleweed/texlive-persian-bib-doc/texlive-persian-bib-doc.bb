SUMMARY = "Documentation for texlive-persian-bib"
DESCRIPTION = "This package includes the documentation for texlive-persian-bib"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn76790"

RPM_NAME = "texlive-persian-bib-doc-2026.226.0.0.9svn76790-58.2.noarch.rpm"
RPM_HASH = "a0631340d8228bd5d3e58049d496c655e7cb2515be9ad0769f4518372979323df34ed0e167114c8e42aff68e5ab0a412dc8bffb31e7661f145886e11d9342633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-persian-bib-doc-fa \
texlive-persian-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
