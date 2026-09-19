SUMMARY = "Bug classification for LaTeX related bugs"
DESCRIPTION = "The package is written in order to help identifying the \
rightful addressee for a bug report. The LaTeX team asks that \
it will be loaded in any test file that is intended to be sent \
to the LaTeX bug database as part of a bug report."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0qsvn78101"

RPM_NAME = "texlive-latexbug-2026.226.1.0qsvn78101-61.2.noarch.rpm"
RPM_HASH = "a872f718a15b5a83a7088318c5ff297abfac08898c07a2b681e21ad4ae85984e4a1eec3116b2f1f18098efa2978fd51b77f4d10911f1cbb641890a93079809e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexbug.sty \
texlive-latexbug"

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
