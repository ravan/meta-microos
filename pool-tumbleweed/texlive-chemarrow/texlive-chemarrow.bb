SUMMARY = "Arrows for use in chemistry"
DESCRIPTION = "This bundle consists of a font (available as Metafont source, \
MetaPost source, and generated type 1 versions), and a package \
to use it. The arrows in the font are designed to look more \
like those in chemistry text-books than do Knuth's originals."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-2026.226.0.0.9svn17146-60.2.noarch.rpm"
RPM_HASH = "fb7cc2c8cba2fb4c2b7398cadeb842b8973f5becec4c7bd7abc31999cfa5e90d935bf33587a37f15ac0997cb8ac57c4ed2c168c77fc6e58f1937cc8e0aa90f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrow.tfm \
tex-chemarrow.map \
tex-chemarrow.sty \
texlive-chemarrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-chemarrow-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
