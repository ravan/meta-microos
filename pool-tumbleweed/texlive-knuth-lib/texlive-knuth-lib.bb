SUMMARY = "Core TeX and Metafont sources from Knuth"
DESCRIPTION = "A collection of core TeX and Metafont macro files from DEK, \
apart from the plain format and base. Includes the MF logo \
font(s), webmac.tex, etc."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn57963"

RPM_NAME = "texlive-knuth-lib-2026.226.svn57963-63.2.noarch.rpm"
RPM_HASH = "240f3260709f5e7e9dcfa2888487fa53f02903daa426ce40569abd53642342024341a37e596f0da475a3a79074dd293f5c63b18179d7b180e57a2186a7dc000e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logo10.tfm \
tex-logo8.tfm \
tex-logo9.tfm \
tex-logobf10.tfm \
tex-logosl10.tfm \
tex-manfnt.tfm \
tex-manmac.tex \
tex-mftmac.tex \
tex-null.tex \
tex-story.tex \
tex-testfont.tex \
tex-webmac.tex \
texlive-knuth-lib \
texlive-misc"

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
