SUMMARY = "Extended version of Knuth's logo typeface"
DESCRIPTION = "The fetamont typeface was designed in Metafont and extends the \
Logo fonts to complete the T1 encoding. The designs of the \
glyphs A, E, F, M, N, O, P, S and T are based on the Metafont \
constructions by D. E. Knuth. The glyphs Y and 1 imitate the \
shapes of the corresponding glyphs in the METATYPE1 logo."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fetamont-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "6a7976d233233e612bf06a4b5e2fcb8f3e0167b72d66bf19481747fa4e8f4abf439d06e6ffebf243956b0f15d20e63726d38bf1a06dd6b7a2d6a0b7911902b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-T1ffm.fd \
tex-T1ffmw.fd \
tex-fetamont.map \
tex-fetamont.sty \
tex-ffmb10.tfm \
tex-ffmb8.tfm \
tex-ffmb9.tfm \
tex-ffmbc40.tfm \
tex-ffmbco40.tfm \
tex-ffmbo10.tfm \
tex-ffmbo8.tfm \
tex-ffmbo9.tfm \
tex-ffmbw10.tfm \
tex-ffmbwo10.tfm \
tex-ffmc10.tfm \
tex-ffmco10.tfm \
tex-ffmh10.tfm \
tex-ffmh8.tfm \
tex-ffmh9.tfm \
tex-ffmho10.tfm \
tex-ffmho8.tfm \
tex-ffmho9.tfm \
tex-ffmhw10.tfm \
tex-ffmhwo10.tfm \
tex-ffml10.tfm \
tex-ffmlc10.tfm \
tex-ffmlco10.tfm \
tex-ffmlo10.tfm \
tex-ffmlq10.tfm \
tex-ffmlqo10.tfm \
tex-ffmlw10.tfm \
tex-ffmlwo10.tfm \
tex-ffmo10.tfm \
tex-ffmo8.tfm \
tex-ffmo9.tfm \
tex-ffmr10.tfm \
tex-ffmr8.tfm \
tex-ffmr9.tfm \
tex-ffmw10.tfm \
tex-ffmwo10.tfm \
texlive-fetamont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-fetamont-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
