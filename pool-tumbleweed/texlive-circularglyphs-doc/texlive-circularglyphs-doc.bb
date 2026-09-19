SUMMARY = "Documentation for texlive-circularglyphs"
DESCRIPTION = "This package includes the documentation for texlive-circularglyphs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-circularglyphs-doc-2026.226.0.0.1.1svn73069-60.2.noarch.rpm"
RPM_HASH = "191a0c3c2ad603ba4e05e2412df1c0b7bdad1eddccde1cbe1fbbbbb8155c8d7f1c43354f49039cf445a5e550fe3baa62392d16b08f877dd0b749ec2b2c4c65c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-circularglyphs-doc-fr \
texlive-circularglyphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
