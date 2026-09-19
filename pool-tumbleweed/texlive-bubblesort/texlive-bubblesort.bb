SUMMARY = "Bubble sorts a list"
DESCRIPTION = "This package sorts a list of TeX items {item 1}...{item k} in \
'increasing' order where 'increasing' is determined by a \
comparator macro. By default it sorts real numbers with the \
usual meaning of 'increasing' but some other examples are \
discussed in the documentation. A second macro is included \
which sorts one list and applies the same permutation to a \
second list."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56070"

RPM_NAME = "texlive-bubblesort-2026.226.1.0svn56070-59.2.noarch.rpm"
RPM_HASH = "a4e93eff5887cf718206a0eced0d866b81abdf4eee67de03a38f1da9c386f086215c35e33c12dab8898e09d39cdf8b0998e81e36187faee91a808d496cd68e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bubblesort.sty \
texlive-bubblesort"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
