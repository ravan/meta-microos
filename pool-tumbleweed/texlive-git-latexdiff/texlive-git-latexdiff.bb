SUMMARY = "Call latexdiff on two Git revisions of a file"
DESCRIPTION = "git-latexdiff is a tool to graphically visualize differences \
between different versions of a LaTeX file. Technically, it is \
a wrapper around git and latexdiff."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.7.1svn75878"

RPM_NAME = "texlive-git-latexdiff-2026.226.1.7.1svn75878-60.2.noarch.rpm"
RPM_HASH = "3e7c0117539518a0f9b1ab003b8aab0b8b7a369212de1e7f446602e062ca6bff53036e1aae991c5726dd3edd43f68218673314ed5fc4ada5a73dc7e24942f6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-git-latexdiff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-git-latexdiff-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
