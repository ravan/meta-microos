SUMMARY = "Ancient Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ancient Greek in LGR and UTF-8 \
encodings, including support for (obsolete) Ibycus font \
encoding. Patterns in UTF-8 use two code positions for each of \
the vowels with acute accent (a.k.a tonos, oxia), e.g., U+03AE, \
U+1F75 for eta."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-ancientgreek-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "c26ce4fcc326fbdfc9a1b24bc6b8f9577f534e6933a965043725bb4b4e0b85d91c6a2e86cc5b98fe7f32559824fc5d10b2f83e2963953b71c9d6cefba2c16a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grahyph5.tex \
tex-hyph-grc.tex \
tex-ibyhyph.tex \
tex-loadhyph-grc.tex \
texlive-hyphen-ancientgreek"

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
