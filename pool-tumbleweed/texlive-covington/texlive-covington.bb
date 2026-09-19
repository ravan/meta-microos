SUMMARY = "LaTeX macros for Linguistics"
DESCRIPTION = "Numerous minor LaTeX enhancements for linguistics, including \
multiple accents on the same letter, interline glosses \
(word-by-word translations), Discourse Representation \
Structures, and example numbering."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77216"

RPM_NAME = "texlive-covington-2026.226.2.16svn77216-61.2.noarch.rpm"
RPM_HASH = "2b001327b23de9782ae7293066d48e4bb7ee6c5fc6f1919a1b0267da3458a91201043a2b1829ef3e6f6488f4cf9242310a3a84e1aa80424c37f9a282014dc0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-covington.sty \
texlive-covington"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
