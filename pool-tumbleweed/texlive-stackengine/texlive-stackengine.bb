SUMMARY = "Highly customised stacking of objects, insets, baseline changes, etcetera"
DESCRIPTION = "The package provides a versatile way to stack objects \
vertically in a variety of customizable ways. A number of \
useful macros are provided, all of which make use of the \
stackengine core."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn75878"

RPM_NAME = "texlive-stackengine-2026.226.4.11svn75878-64.2.noarch.rpm"
RPM_HASH = "dad61afbb8e4e3319c41c04add7c1079a11f0cd27d5a9ede125806eb79314e57faa1cc814559235d9bea9dd57691221e55e62dcee6263a8ce06b9a40b1bb53fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stackengine.sty \
texlive-stackengine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-listofitems.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listofitems \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
