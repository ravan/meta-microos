SUMMARY = "Define commands that peek ahead in the input stream"
DESCRIPTION = "The package provides tools to help define commands that, like \
\\xspace and the LaTeX command \\textit, peek at what follows \
them in the command stream and choose appropriate behaviour."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-2026.226.0.0.2svn61719-59.4.noarch.rpm"
RPM_HASH = "f2ff6642103123da5a24f410ea1529490cdc9c1cd7d031e95ca66a5130b20a8fd7ef960c9a9f8e78c90b9b22a9166459f315927122f51f8c148f7f0b4451bb91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpeek.sty \
texlive-xpeek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
