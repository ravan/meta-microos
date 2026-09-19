SUMMARY = "Documentation for texlive-gridslides"
DESCRIPTION = "This package includes the documentation for texlive-gridslides"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-doc-2026.226.0.0.1.1svn54512-60.4.noarch.rpm"
RPM_HASH = "644dcfd102fd210e1ce1e688f49e34a7900c9c5ae8d539c72b1fbc68fc1ab3f74e2c165ac98a9cd0e3d4feacc4bfdb5c2f2081c60a2c5af97768c131e6a9b97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridslides-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
