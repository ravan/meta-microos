SUMMARY = "Documentation for texlive-reledmac"
DESCRIPTION = "This package includes the documentation for texlive-reledmac"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.44.3svn78101"

RPM_NAME = "texlive-reledmac-doc-2026.226.2.44.3svn78101-60.4.noarch.rpm"
RPM_HASH = "f776ce1a36cc58cffda84a05d4a4d3d0c6ea259430fb4bad26a3fbad6145274c65a4dd755cca6f3224ee16a1497703f07980fc23925d7ec408f96bdf07bded5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
