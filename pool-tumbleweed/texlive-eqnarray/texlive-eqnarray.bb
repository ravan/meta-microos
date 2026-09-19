SUMMARY = "More generalised equation arrays with numbering"
DESCRIPTION = "Defines an equationarray environment, that allows more than \
three columns, but otherwise behaves like LaTeX's eqnarray \
environment. This environment is similar, in some ways, to the \
align environment of amsmath. The package requires the array \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-eqnarray-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "8a52226a8c6182a0caef0650a23e00efd96de279d60ea11875219ade9f09a68c7d8fb65899cbb8d06dc65df62427d18b9fc157c5a4d62d89f773d0016c18e318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnarray.sty \
texlive-eqnarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
