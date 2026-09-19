SUMMARY = "Documentation for texlive-fcavtex"
DESCRIPTION = "This package includes the documentation for texlive-fcavtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn38074"

RPM_NAME = "texlive-fcavtex-doc-2026.226.1.1svn38074-59.2.noarch.rpm"
RPM_HASH = "e39593adfb0350af09cd7f2eeaa6503a1b02263c5a19ab4e8716d11390b98a224993b8150454215b3d97434f821dd37045c251cf0fa4cea65315e8a187e01c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fcavtex-doc-pt \
texlive-fcavtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
