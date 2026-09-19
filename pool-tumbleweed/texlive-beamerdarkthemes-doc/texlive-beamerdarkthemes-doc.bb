SUMMARY = "Documentation for texlive-beamerdarkthemes"
DESCRIPTION = "This package includes the documentation for texlive-beamerdarkthemes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-doc-2026.226.0.0.5.1svn55117-61.2.noarch.rpm"
RPM_HASH = "98b2e565c9401161d38f8d3c0fbfb6be7e0fcf476f01475a7475c2984d064dc0515fc660d65742d667249813c2f49a49147009df1a2d3ba853eca2881d78a079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerdarkthemes-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
