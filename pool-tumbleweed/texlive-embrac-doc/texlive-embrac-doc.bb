SUMMARY = "Documentation for texlive-embrac"
DESCRIPTION = "This package includes the documentation for texlive-embrac"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9asvn77682"

RPM_NAME = "texlive-embrac-doc-2026.226.0.0.9asvn77682-61.4.noarch.rpm"
RPM_HASH = "0f5d8d20c8df3fc682c463ed10f04ad15efbc892d455397c3572dba5b69b2969d65cbe2e431a443db7a8774c49ffdc6fa023e39979dba1d8a9b3681cd7c14acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
