SUMMARY = "Float environment to document the shell commands of a terminal session"
DESCRIPTION = "The package provides a simple, though fancy float environment \
to document terminal sessions -- like command executions or \
shell operations. The look and feel of the package output \
imitates the look of a shell prompt."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-2026.226.2.1bsvn41991-60.2.noarch.rpm"
RPM_HASH = "9704d5234f4d9b67332d56e7d4e0b9fd1793f0a3ed43d4dbc9f9f73f767481cea773aaa0dd009c286fa27552c0974f143684bbe64521590b71a0166e6772c2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shdoc.sty \
texlive-shdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-float.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-mdframed.sty \
tex-relsize.sty \
tex-stringstrings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
