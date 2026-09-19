SUMMARY = "Documentation for texlive-easyformat"
DESCRIPTION = "This package includes the documentation for texlive-easyformat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-doc-2026.226.1.4.0svn44543-61.4.noarch.rpm"
RPM_HASH = "96ae8a1529ee4b510a0521a3cb804667899e0a0bce270b0b66cf6a549fec898014aa1f6d62a387cd0948d0e835383d9e7e442455b98c3117443b201bd8b18bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
