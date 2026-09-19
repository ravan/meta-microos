SUMMARY = "Documentation for texlive-gregoriotex"
DESCRIPTION = "This package includes the documentation for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.1.0svn74348"

RPM_NAME = "texlive-gregoriotex-doc-2026.226.6.1.0svn74348-60.4.noarch.rpm"
RPM_HASH = "8b45c3d38d06718a0cf445a523412ac038f64ea04528717f962bd710b27803b8013cfd67c2d6a64eb122b724f98fe91c7d69a3f7e5d8a52b42616cc0780b9943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gregoriotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
