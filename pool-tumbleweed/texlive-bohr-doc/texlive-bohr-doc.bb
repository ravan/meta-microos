SUMMARY = "Documentation for texlive-bohr"
DESCRIPTION = "This package includes the documentation for texlive-bohr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62977"

RPM_NAME = "texlive-bohr-doc-2026.226.1.0svn62977-59.2.noarch.rpm"
RPM_HASH = "41d44317e211e495d716e5c50d5281774c63ea94e3f7dc1488571ed128eb545784621d2ccbee9bdd70fe81651c9ecff8297c6b42efeb4ade3259ca6b145b8892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bohr-doc"

RDEPENDS:${PN} += ""

inherit rpm
