SUMMARY = "Documentation for texlive-styledcmd"
DESCRIPTION = "This package includes the documentation for texlive-styledcmd"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.1svn76924"

RPM_NAME = "texlive-styledcmd-doc-2026.226.2.0.1svn76924-64.2.noarch.rpm"
RPM_HASH = "bba30ba32789ad8b891345443d5b174f54c5d2ca62e45ed95c0d71c1bd82dd1c49831b458e43e2973fa69d7202451f30da8324cacc7f64eab398b17fa25ab3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-styledcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
