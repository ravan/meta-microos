SUMMARY = "Occitan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Occitan in T1/EC and UTF-8 encodings. \
They are supposed to be valid for all the Occitan variants \
spoken and written in the wide area called 'Occitanie' by the \
French. It ranges from the Val d'Aran within Catalunya, to the \
South Western Italian Alps encompassing the southern half of \
the French pentagon."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-occitan-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "bc1d870638af8f1aeb16b690488a786b5a1e2df67a28356fb56402075b56f709b77ba61924cfdab34e3701ce018ff04e79cad66f8eadbfd1f7e12c2aecd9a23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-oc.ec.tex \
tex-hyph-oc.tex \
tex-hyph-quote-oc.tex \
tex-loadhyph-oc.tex \
texlive-hyphen-occitan"

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
