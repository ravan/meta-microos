SUMMARY = "Documentation for texlive-exercises"
DESCRIPTION = "This package includes the documentation for texlive-exercises"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn55188"

RPM_NAME = "texlive-exercises-doc-2026.226.1.1svn55188-59.2.noarch.rpm"
RPM_HASH = "578e1ac871a9e680569cbba954b09e0b9bb845df9b70a3d161df4db09abdf096072b8d05b15eaee5c08f142f51a06fb4b9a6b085d1ceac6f0f12629ce84da111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercises-doc"

RDEPENDS:${PN} += ""

inherit rpm
