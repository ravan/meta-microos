SUMMARY = "Documentation for texlive-resumecls"
DESCRIPTION = "This package includes the documentation for texlive-resumecls"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-doc-2026.226.0.0.4.1svn54815-60.4.noarch.rpm"
RPM_HASH = "21aa9f36cfa058027a7a967b6ca7b59ac4e0a17dac4a9b2dd1367d2ce80be284b98b20fd4648a3851a801102c897508724952edd8fe612419552e31bb385c73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumecls-doc"

RDEPENDS:${PN} += ""

inherit rpm
