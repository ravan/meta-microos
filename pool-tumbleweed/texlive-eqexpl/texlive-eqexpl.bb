SUMMARY = "Align explanations for formulas"
DESCRIPTION = "This package was developed in response to a question on \
https://tex.stackexchange.com. Its purpose is to enable a \
perfectly formatted explanation of components of a formula. The \
package depends on calc, etoolbox, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-2026.226.1.1.1svn63629-61.4.noarch.rpm"
RPM_HASH = "7160abf2927c1e90c49d0da792d38c6ec36387d161e5cc66db40f2f3a185b4a25d85ea56e08d89e1e6cddf7b1c1927b98f4a0ff35e17a567ea829abeace708f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqexpl.sty \
texlive-eqexpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
