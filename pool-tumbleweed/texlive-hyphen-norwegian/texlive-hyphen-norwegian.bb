SUMMARY = "Norwegian Bokmal and Nynorsk hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Norwegian Bokmal and Nynorsk in T1/EC \
and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-norwegian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "2e0831244a91a584444e8a16a4ac5fb08e89b9d75182257a7245098ed589b829b4923d772bb2931763e662623e2e534ce782307f58061b9d1263213064a72ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-nb.ec.tex \
tex-hyph-nb.tex \
tex-hyph-nn.ec.tex \
tex-hyph-nn.tex \
tex-hyph-no.tex \
tex-loadhyph-nb.tex \
tex-loadhyph-nn.tex \
texlive-hyphen-norwegian"

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
