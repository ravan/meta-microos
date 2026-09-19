SUMMARY = "Documentation for texlive-biber-ms"
DESCRIPTION = "This package includes the documentation for texlive-biber-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2026.226.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-doc-2026.226.4.0_1svn66478-61.2.noarch.rpm"
RPM_HASH = "0a63174cc0a2674076df8d7408e65f97bb0532863911736725ad43cfd57fef8bd996bc960ff00d495b6ebdfc0004c54dac26edc190e0411a1835f5ca4881551c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-doc"

RDEPENDS:${PN} += ""

inherit rpm
