SUMMARY = "Documentation for texlive-philokalia"
DESCRIPTION = "This package includes the documentation for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn45356"

RPM_NAME = "texlive-philokalia-doc-2026.226.1.2svn45356-58.2.noarch.rpm"
RPM_HASH = "fabb889cf5c5c884ee06d6b949d76e6d0394e38047ccc65ac51afa7f55f58a8eeb5532da483d7b4e8c0251fc410aee3fc1425582d9ae11d9b39d1f4d2cb2aa30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philokalia-doc"

RDEPENDS:${PN} += ""

inherit rpm
