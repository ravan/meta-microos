SUMMARY = "The package provides dedicated TeX commands to generate (vectorial) meteorological symbols"
DESCRIPTION = "The metsymb package introduces commands to generate official \
meteorological symbols with vectorial quality. These include: \
oktas (\\zerookta, \\oneokta, \\twooktas, \\ldots), cloud genera \
(\\cirrus, \\cirrostratus, \\nimbostratus, ...), and C_L / C_M / \
C_H cloud codes (\\clIII, \\cmVI, \\chIX, ...). Individual symbols \
are designed using TikZ. They are then bundled into a dedicated \
font with FontForge, and eventually tied to dedicted LaTeX \
commands. The metsymb OpenType font is a side-product that can \
be used on its own. This package essentially introduces a new \
font in which each symbol is assigned to a glyph, which can \
then be called individually from LaTeX documents via dedicated \
commands."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2.0svn68175"

RPM_NAME = "texlive-metsymb-2026.226.1.2.0svn68175-61.2.noarch.rpm"
RPM_HASH = "df39d83fda0ee168332a27c98fca6e5b81e9acf97baba99002575b58a6eb721ceeddd57526c9e0a79d11334dcc48b9b93abe36c2d1e5fcdba8d8ab47140350c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metsymb.enc \
tex-metsymb.map \
tex-metsymb.sty \
tex-metsymb.tfm \
tex-umetsymb.fd \
texlive-metsymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metsymb-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
