SUMMARY = "Documentation for texlive-chletter"
DESCRIPTION = "This package includes the documentation for texlive-chletter"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn20060"

RPM_NAME = "texlive-chletter-doc-2026.226.2.0svn20060-60.2.noarch.rpm"
RPM_HASH = "39a2280c7523afde7868fc0255b94b023ebc80e9156d51f75dc68794f8fed76cf12e65b43d45ec417bd4a215769ebeda59b7021bb9f7d5b40ea62af42ba0cac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chletter-doc-en \
texlive-chletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
