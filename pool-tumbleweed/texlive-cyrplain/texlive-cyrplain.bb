SUMMARY = "Support for using T2 encoding"
DESCRIPTION = "The T2 bundle provides a variety of separate support functions \
for using Cyrillic characters in LaTeX: the mathtext package, \
for using Cyrillic letters 'transparently' in formulae; the \
citehack package, for using Cyrillic (or indeed any non-ascii) \
characters in citation keys; support for Cyrillic in BibTeX; \
support for Cyrillic in Makeindex; and various items of font \
support."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45692"

RPM_NAME = "texlive-cyrplain-2026.226.svn45692-61.2.noarch.rpm"
RPM_HASH = "c23be3f4edb005dad651750bb73dd051a752895db493fbacefac233caf667ddb9ce167f18a5d4b30fe662ab1878198f8ccba84c6dea2afae076d3606da5ff538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-cyrplain \
tex-cyrcmfnt.tex \
tex-cyrecfnt.tex \
tex-cyrtex.cfg \
tex-cyrtex.tex \
tex-plainenc.tex \
tex-txxdefs.tex \
tex-txxextra.tex \
texlive-cyrplain"

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
