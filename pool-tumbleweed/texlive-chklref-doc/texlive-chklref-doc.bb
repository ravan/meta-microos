SUMMARY = "Documentation for texlive-chklref"
DESCRIPTION = "This package includes the documentation for texlive-chklref"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1.2svn52649"

RPM_NAME = "texlive-chklref-doc-2026.226.3.1.2svn52649-60.2.noarch.rpm"
RPM_HASH = "14f875e7c5f49b097b774196db614dcb7a8a25348853cd74bc7ac854709b13cae20cabd7e3808ec87ee70811a9523f75f411fe8f6dccaaa2b11b148207cad8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chklref.1 \
texlive-chklref-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
