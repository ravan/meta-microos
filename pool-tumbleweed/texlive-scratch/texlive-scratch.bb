SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package is now obsolete. From now on, scratch at \
scratch.mit.edu is now version3 with a new design. Please, use \
the 'scratch3' package to draw blocks with the new design. This \
package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn66655"

RPM_NAME = "texlive-scratch-2026.226.0.0.41svn66655-60.2.noarch.rpm"
RPM_HASH = "6eec02d5644ffca2bde9ac1a40a0d1dc8a56597f9cc7356f36b4a195224b42db62d24d7958c6ff3a6bd5628bd5fec2b7e0e52ad478db436b72c6871ae78030ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch.sty \
texlive-scratch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
