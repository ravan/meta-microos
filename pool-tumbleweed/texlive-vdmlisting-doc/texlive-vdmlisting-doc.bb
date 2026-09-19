SUMMARY = "Documentation for texlive-vdmlisting"
DESCRIPTION = "This package includes the documentation for texlive-vdmlisting"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-doc-2026.226.1.1svn56905-60.2.noarch.rpm"
RPM_HASH = "d1b598d3eaaf3f8732acc521e33af6c3d7e0550b7294e381de731b4a8a7b9992403ab358493b20b4f75638728d2651d1eb833b13581442ec5e07a0007d57b45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vdmlisting-doc"

RDEPENDS:${PN} += ""

inherit rpm
