SUMMARY = "Documentation for texlive-tikz-inet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-inet"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-doc-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "53e24d06970213c57203c216da67e1d26ecec9da52d10d48905b5a6cab251307ea2523aa1b79c056b70ee64e82ba7426924947978b7b3007cd7e30c7589c2007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-inet-doc"

RDEPENDS:${PN} += ""

inherit rpm
