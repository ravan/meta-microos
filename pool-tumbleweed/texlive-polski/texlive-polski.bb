SUMMARY = "Typeset Polish documents with LaTeX and Polish fonts"
DESCRIPTION = "Tools to typeset monolingual Polish documents in LaTeX2e \
without babel or polyglossia. The package loads Polish \
hyphenation patterns, ensures that a font encoding suitable for \
Polish is used; in particular it enables Polish adaptation of \
Computer Modern fonts (the so-called PL fonts), provides \
translations of \\today and names like 'Bibliography' or \
'Chapter', redefines math symbols according to Polish \
typographical tradition, provides macros for dashes according \
to Polish orthography, provides a historical input method for \
'Polish characters', works with traditional TeX as well as with \
Unicode aware variants. (This package was previously known as \
platex, but has been renamed to resolve a name clash.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.6svn78101"

RPM_NAME = "texlive-polski-2026.226.1.3.6svn78101-59.2.noarch.rpm"
RPM_HASH = "a77596fdbeb49eaa57b571356a8d7d09144210f4594ed783abcdad5f874d144d7237fd0b23c41a48b941cf376047cbcc90c4223edf99b5df00cfe74df22697ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amigapl.def \
tex-mazovia.def \
tex-omlplcm.fd \
tex-omlplm.fd \
tex-omsplsy.fd \
tex-omxplex.fd \
tex-ot1patch.sty \
tex-ot4ccr.fd \
tex-ot4cmdh.fd \
tex-ot4cmfib.fd \
tex-ot4cmfr.fd \
tex-ot4cmr.fd \
tex-ot4cmss.fd \
tex-ot4cmtt.fd \
tex-plprefix.sty \
tex-polski.sty \
tex-qxenc.def \
texlive-polski"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ot4enc.def \
texlive \
texlive-filesystem \
texlive-hyphen-polish \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
