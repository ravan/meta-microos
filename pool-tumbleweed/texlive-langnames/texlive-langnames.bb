SUMMARY = "Name languages and their genetic affiliations consistently"
DESCRIPTION = "This package attempts to make the typing of language names, \
codes, and families slightly easier by providing macros to \
access pre-defined language--code--family combinations from two \
important databases, as well as the possibility to create new \
combinations. It may be particularly useful for large, \
collaborative projects as well as typologically minded ones \
with a variety of language examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn69101"

RPM_NAME = "texlive-langnames-2026.226.3.0.0svn69101-63.2.noarch.rpm"
RPM_HASH = "445f74932274db722411afe4134e3188c434b1bdd1a97f0b3af860758c56421b713c7d64d373635255bc5a2b5d585332a975475d4a7f3aff895c2a8e91f3ac7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langnames.sty \
tex-ln-fams-glot.tex \
tex-ln-fams-wals.tex \
tex-ln-langs-glot-native.tex \
tex-ln-langs-glot.tex \
tex-ln-langs-wals-native.tex \
tex-ln-langs-wals.tex \
texlive-langnames"

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
