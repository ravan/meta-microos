SUMMARY = "Tibetan for TeX and LaTeX2e"
DESCRIPTION = "A package using a modified version of Sirlin's Tibetan font. An \
advantage of this Tibetan implementation is that all consonant \
clusters are formed by TeX and Metafont. No external \
preprocessor is needed."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ctib-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "531e8d46cfab168611e3e3ef957592acaffcc3a94b4eb17497e9dc4f24f5c1b42ec0bc67993a406da788250f28bdfb011f626ecdb8f36b3dbac6a9963b59de5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctib.sty \
tex-ctib.tex \
tex-ctib.tfm \
tex-lctctib.fd \
tex-lctenc.def \
texlive-ctib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
