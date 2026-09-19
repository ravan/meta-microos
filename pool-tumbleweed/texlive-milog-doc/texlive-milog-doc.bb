SUMMARY = "Documentation for texlive-milog"
DESCRIPTION = "This package includes the documentation for texlive-milog"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75447"

RPM_NAME = "texlive-milog-doc-2026.226.1.0svn75447-61.2.noarch.rpm"
RPM_HASH = "dd952efe0cb576a4e8e7035ee716685c3ad6252d709c7430a506bb322da5adef728a456364f462915b083eee33bf252e1bd4752038ea25f050667ca56a0ac10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-milog-doc-de \
texlive-milog-doc"

RDEPENDS:${PN} += ""

inherit rpm
