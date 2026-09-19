SUMMARY = "A PSTricks package for tilting and other pseudo-3D tricks"
DESCRIPTION = "The package provides basic macros that use PSTricks for \
shadows, tilting and three dimensional representations of text \
or graphical objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-pst-3d-2026.226.1.10svn77682-59.2.noarch.rpm"
RPM_HASH = "b3b31fd7410249a46324d2c1617312d7e218d163b506dd007453d50fa89c75c10309ebbf00f13f1ef45f7f82baa092a4b6c77bca8048a2253f4f4f2f4576ab15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-3d.sty \
tex-pst-3d.tex \
texlive-pst-3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
