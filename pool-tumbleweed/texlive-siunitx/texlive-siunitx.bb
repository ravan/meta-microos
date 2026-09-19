SUMMARY = "A comprehensive (SI) units package"
DESCRIPTION = "Physical quantities have both numbers and units, and each \
physical quantity should be expressed as the product of a \
number and a unit. Typesetting physical quantities requires \
care to ensure that the combined mathematical meaning of the \
number-unit combination is clear. In particular, the SI units \
system lays down a consistent set of units with rules on how \
these are to be used. However, different countries and \
publishers have differing conventions on the exact appearance \
of numbers (and units). The siunitx package provides a set of \
tools for authors to typeset quantities in a consistent way. \
The package has an extended set of configuration options which \
make it possible to follow varying typographic conventions with \
the same input syntax. The package includes automated \
processing of numbers and units, and the ability to control \
tabular alignment of numbers."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4.14svn77682"

RPM_NAME = "texlive-siunitx-2026.226.3.4.14svn77682-64.2.noarch.rpm"
RPM_HASH = "db7b35484e0ff090a2d42eaafdfe22ae242b6f210233954bed3d2023a31cb3c6ac5734f80ac23c1bd7642de97258568430fdcb53869d66735a6387935c194ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-siunitx-abbreviations.cfg \
tex-siunitx-binary.cfg \
tex-siunitx-v2.sty \
tex-siunitx-version-1.cfg \
tex-siunitx.sty \
texlive-siunitx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-array.sty \
tex-color.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-textcomp.sty \
tex-translations.sty \
tex-translator.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
