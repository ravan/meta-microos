SUMMARY = "A 'new' version of the karta cartographic fonts"
DESCRIPTION = "A development of the karta font, offering more mathematical \
stability in Metafont. A version that will produce the glyphs \
as Encapsulated PostScript, using MetaPost, is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-2026.226.0.0.2svn16437-61.2.noarch.rpm"
RPM_HASH = "862d765557b74f2dbf0bce9f707391dea705756ec5516af57d5ea4b1a84b7cccf1f7031e5f657d6021daaa2d8819338440a12c9162ce3dd7d161a7fcd16eef59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nkarta15.tfm \
texlive-nkarta"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
