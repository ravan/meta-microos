SUMMARY = "Create Object-Role Model (ORM) diagrams"
DESCRIPTION = "The package provides styles for drawing Object-Role Model (ORM) \
diagrams in TeX based on the PGF and TikZ picture environment."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-2026.226.0.0.1.4svn61719-59.2.noarch.rpm"
RPM_HASH = "c1db909379371b3459c58175b3616d8bc9cfad67831ef0d9b1e71323eb52799d81e61c8ee8058899fcd111eb8e3211465dba3f1dcdac16dd4ce4745108a35fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-orm.sty \
texlive-tkz-orm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
