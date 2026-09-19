SUMMARY = "Documentation for texlive-gmiflink"
DESCRIPTION = "This package includes the documentation for texlive-gmiflink"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-doc-2026.226.0.0.97svn15878-60.4.noarch.rpm"
RPM_HASH = "9dd2806648929aac8c4934fdbcef8abdc35c08820a9ba0fa33822638644b8353ec1b32ac767133f290ae19f39b2f695c9b605686580ae0a27b40c03b63841062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmiflink-doc"

RDEPENDS:${PN} += ""

inherit rpm
