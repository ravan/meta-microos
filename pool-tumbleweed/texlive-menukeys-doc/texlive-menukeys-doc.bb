SUMMARY = "Documentation for texlive-menukeys"
DESCRIPTION = "This package includes the documentation for texlive-menukeys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.2svn77682"

RPM_NAME = "texlive-menukeys-doc-2026.226.1.6.2svn77682-61.2.noarch.rpm"
RPM_HASH = "08d06d484c6a2a0185320b46da7b7b7f42eea074ed861ed2ab25fa8c93323c96710bce79bc3f78c2ab908207e8b191e1804d3e74a127b5017b03bca5602deb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menukeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
