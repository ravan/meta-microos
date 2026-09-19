SUMMARY = "Using array structures in LaTeX"
DESCRIPTION = "The package provides functionality for processing lists and \
array structures in LaTeX. Arrays can contain characters as \
well as TeX and LaTeX commands, nesting of arrays is possible, \
and arrays are processed within the same brace level as their \
surrounding environment. Array levels can be delimited by \
characters or control sequences defined by the user. Practical \
uses of this package include data management, construction of \
lists and tables, and calculations based on the contents of \
lists and arrays."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn78101"

RPM_NAME = "texlive-forarray-2026.226.1.01svn78101-60.2.noarch.rpm"
RPM_HASH = "b97acd0af5966ce545f5bc23c1eae0d7e14820b56ea77236cebc6680535ac65953d0016d776806cb9fce905414c978cd74759eca8654210f82afcbc714b0cbe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forarray.sty \
texlive-forarray"

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
