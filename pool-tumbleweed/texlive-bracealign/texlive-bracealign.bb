SUMMARY = "Align braces under and over math expressions"
DESCRIPTION = "A LaTeX package to align braces under and over math \
expressions. A new environment called bracealign is provided, \
inside which braces and brackets drawn with the commands \
\\underbrace, \\overbrace, \\underbracket, \\overbracket, \
\\underparen or \\overparenare vertically aligned. The package \
also allows adding support for new commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-bracealign-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "d8f9b535c1a20ff40b65b2b3b7ea1bf263edd62b10e8adefdb81b122047a7159400ce62cb2bb136579843e499a388076abdc72e82af0b40877c7200080f4f471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bracealign.sty \
texlive-bracealign"

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
