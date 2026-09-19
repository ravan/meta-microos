SUMMARY = "Documentation for texlive-couleurs-fr"
DESCRIPTION = "This package includes the documentation for texlive-couleurs-fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn76790"

RPM_NAME = "texlive-couleurs-fr-doc-2026.226.0.0.1.4svn76790-61.2.noarch.rpm"
RPM_HASH = "58b558a1c9d3dd184e594a9a39e6feafd44a0e506bd862619a1d361ff32225211f23f7bfc37e347fa241439f21cb69ed780861c8c0ab0a8e84fd1229d0eff1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-couleurs-fr-doc-fr \
texlive-couleurs-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
