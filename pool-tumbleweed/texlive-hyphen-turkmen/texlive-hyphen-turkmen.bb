SUMMARY = "Turkmen hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkmen in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-turkmen-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "01aa3d0f56a1ba4f63865bb9a5b37f990247591d8991b36a71ebc7ea117266037d8a4bfaf50e942223054db1af913a1eb02bd3852be0a6f2f6bf83506bc9a68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-tk.ec.tex \
tex-hyph-tk.tex \
tex-loadhyph-tk.tex \
texlive-hyphen-turkmen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
