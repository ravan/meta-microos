SUMMARY = "Documentation for texlive-stex"
DESCRIPTION = "This package includes the documentation for texlive-stex"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.0svn76825"

RPM_NAME = "texlive-stex-doc-2026.226.4.0.0svn76825-64.2.noarch.rpm"
RPM_HASH = "89bbd2a197a2c0c79bb3064ab74bdf8d9f26c809e324508902f24ad810042f0fcb5bee784e4a159a7402379a2009d4be32d8c474253a8e57760289ea28a2c855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stex-doc"

RDEPENDS:${PN} += ""

inherit rpm
