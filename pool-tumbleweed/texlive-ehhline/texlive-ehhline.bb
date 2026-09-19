SUMMARY = "Extend the \\hhline command"
DESCRIPTION = "This package extends the \\hhline command with a !{...} token, \
which allows to create lines with arbitrary LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn54676"

RPM_NAME = "texlive-ehhline-2026.226.1.1svn54676-61.4.noarch.rpm"
RPM_HASH = "e38c5375a881cd76a13717a267d8d4ac1df762410ad50b1d3112936988dce2a8e7f4f4d027d0a65d3f89f3eeaef4e554dbe5ffc212170cd8d99929379dd8814d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ehhline.sty \
texlive-ehhline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-hhline.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
