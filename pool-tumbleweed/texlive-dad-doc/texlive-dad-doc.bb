SUMMARY = "Documentation for texlive-dad"
DESCRIPTION = "This package includes the documentation for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn54191"

RPM_NAME = "texlive-dad-doc-2026.226.1.2svn54191-61.2.noarch.rpm"
RPM_HASH = "d5df845e5da5e3520cdc3f89164262a3c854adeebc50551d2b6a059c3322b41f0bf79b01b0d07146aad6d84b9affd420abfc73f86383c0b5ce6c98a47383b3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dad-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
