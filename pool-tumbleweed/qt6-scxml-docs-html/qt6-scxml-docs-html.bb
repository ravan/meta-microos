SUMMARY = "Documentation for qt6-scxml in HTML format"
DESCRIPTION = "This package contains documentation for qt6-scxml in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e97e4c90d6ed520a075968b1ff3ab1cc04873978be31e9c57bef7a168c3a882dbec57d390b1ac16b8fd1926deb116451ed819c616f14015a20d103e061f7c580"

RPROVIDES:${PN} += "qt6-scxml-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
