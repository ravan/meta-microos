SUMMARY = "Stores LaTeX contents in memory or files"
DESCRIPTION = "This package stores valid LaTeX code in memory (sequences) \
using the l3seq module of expl3. The stored content (including \
verbatim) can be used as many times as desired in the document, \
additionally can be written to external files if desired."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-scontents-2026.226.2.6svn77682-60.2.noarch.rpm"
RPM_HASH = "d5b6140c9756caf3a8695187b122899d4ad060d0a4ffe6bfba69133d1fd046d51add283184fb25c0d02dc449de03acd0bbbe43ff937a22cdf94904f36981c8be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scontents-code.tex \
tex-scontents.sty \
tex-scontents.tex \
texlive-scontents"

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
