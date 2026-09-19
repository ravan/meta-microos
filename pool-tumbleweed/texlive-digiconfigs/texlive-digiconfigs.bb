SUMMARY = "Writing 'configurations'"
DESCRIPTION = "In Stochastic Geometry and Digital Image Analysis some problems \
can be solved in terms of so-called 'configurations'. A \
configuration is basically a square matrix of \\circ and \\bullet \
symbols. This package provides a convenient and compact \
mechanism for displaying these configurations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "0ac9073099f6071038d7d8c1b4db2b5fda195d5f7c0e32237b2a483d668577481878818b205ddbfc82fe7d41d855d1b4dab914d5c479e56b97e8c1eb132ae4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-digiconfigs.sty \
texlive-digiconfigs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
