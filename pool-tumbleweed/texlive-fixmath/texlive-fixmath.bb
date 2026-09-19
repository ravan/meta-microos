SUMMARY = "Make maths comply with ISO 31-0:1992 to ISO 31-13:1992"
DESCRIPTION = "LaTeX's default style of typesetting mathematics does not \
comply with the International Standards ISO 31-0:1992 to ISO \
31-13:1992 which require that uppercase Greek letters always be \
typeset upright, as opposed to italic (even though they usually \
represent variables) and allow for typesetting of variables in \
a boldface italic style (even though the required fonts are \
available). This package ensures that uppercase Greek be \
typeset in italic style, that upright $\\Delta$ and $\\Omega$ \
symbols are available through the commands \\upDelta and \
\\upOmega; and provides a new math alphabet \\mathbold for \
boldface italic letters, including Greek. This package used to \
be part of the was bundle, but has now become a package in its \
own right."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn76924"

RPM_NAME = "texlive-fixmath-2026.226.0.0.9.1svn76924-59.2.noarch.rpm"
RPM_HASH = "b6709e78d76302a9090ce957c404ce68808ebc94de8e53f39e66ae14bcd5300068e9cef5598aee2f979cf3cbd9d0e416adf07b2838c52c20cbe4e238c2bec0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixmath.sty \
texlive-fixmath"

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
