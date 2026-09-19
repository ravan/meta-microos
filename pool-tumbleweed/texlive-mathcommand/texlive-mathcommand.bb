SUMMARY = "\\newcommand-like commands for defining math macros"
DESCRIPTION = "This package provides functionalities for defining macros that \
have different behaviors depending on whether in math or text \
mode, that absorb Primes, Indices and Exponents (PIE) as extra \
parameters usable in the code; and it offers some iteration \
facilities for defining macros with similar code. The primary \
objective of this package is to be used together with the \
knowledge package for a proper handling of mathematical \
notations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn76924"

RPM_NAME = "texlive-mathcommand-2026.226.1.04svn76924-59.2.noarch.rpm"
RPM_HASH = "52ccb5a79bfff36d2e158fe68eda7a1afbd0b42b37627d65c228537d336decae7af4b788c00496405be89d2dbe57020eed4dc36bdafedc96e93e47cf6214e218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathcommand.sty \
texlive-mathcommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
