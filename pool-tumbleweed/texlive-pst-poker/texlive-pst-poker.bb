SUMMARY = "Drawing poker cards"
DESCRIPTION = "This PSTricks related package can create poker cards in various \
manners."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.04asvn75726"

RPM_NAME = "texlive-pst-poker-2026.226.0.0.04asvn75726-60.4.noarch.rpm"
RPM_HASH = "d458193b163924ce09b8f376fc281fdb714f14fd43ab7d2a97816dbd14b1a3c4bd42b27b3dd279854e56dd7c7606c8af13cd8ab202661eec7436b51e385d466f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poker.sty \
texlive-pst-poker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-multido.sty \
tex-pst-blur.sty \
tex-pst-fill.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
