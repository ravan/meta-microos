SUMMARY = "Graphics and font utilities"
DESCRIPTION = "Programs for conversion between font formats, testing fonts, \
virtual fonts, .gf and .pk manipulation, mft, fontinst, etc. \
Manipulating OpenType, TrueType, Type 1,and for manipulation of \
PostScript and other image formats."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn61207"

RPM_NAME = "texlive-collection-fontutils-2026.222.svn61207-68.2.noarch.rpm"
RPM_HASH = "edf54da01fb18db6bd5cf25dd05dae9a3275cdab8dd02accb6281647b5161ea87b76d0d91c7f2f2f8e1a593f04eb47e5942483ed8fb055aa747cbb2e80440f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-fontutils \
texlive-collection-fontutils"

RDEPENDS:${PN} += "psutils \
texlive-accfonts \
texlive-afm2pl \
texlive-albatross \
texlive-collection-basic \
texlive-dosepsbin \
texlive-dvipsconfig \
texlive-epstopdf \
texlive-fontinst \
texlive-fontools \
texlive-fontware \
texlive-lcdftypetools \
texlive-luafindfont \
texlive-metatype1 \
texlive-mf2pt1 \
texlive-ps2eps \
texlive-ps2pk \
texlive-ttfutils"

inherit rpm
