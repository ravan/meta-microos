SUMMARY = "Documentation for texlive-unisc"
DESCRIPTION = "This package includes the documentation for texlive-unisc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn63178"

RPM_NAME = "texlive-unisc-doc-2026.226.0.0.2svn63178-60.2.noarch.rpm"
RPM_HASH = "3b4b57332f3c3101c0c39b158c99c56780e95f9d2c646a75863db3bc73d50b70029e34093343784901bb96d4e08bd7cb77d3ae01167b01062e5f359a14ee611a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
