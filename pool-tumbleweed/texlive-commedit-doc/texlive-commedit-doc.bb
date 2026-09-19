SUMMARY = "Documentation for texlive-commedit"
DESCRIPTION = "This package includes the documentation for texlive-commedit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn50116"

RPM_NAME = "texlive-commedit-doc-2026.226.1.02svn50116-60.2.noarch.rpm"
RPM_HASH = "26beb929e56a4ad0f28388c9b18caaf313f8903d0e98d316a4230c9fa614834503b2e913996f8a5aefbc62c9dfe5369a38c860fab3f65748c32752c1a620cee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commedit-doc"

RDEPENDS:${PN} += ""

inherit rpm
