SUMMARY = "Documentation for texlive-babel-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-doc-2026.226.1.0svn66513-60.2.noarch.rpm"
RPM_HASH = "b66f364972618dd7f2f8baca8dad3bb14e3a0a8c689cf214a11ac0338ec4e569a83cad6a280644e18147eef0cb94baeeb8267d287e1eeaa9bb5c99611a2f1f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-lithuanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
