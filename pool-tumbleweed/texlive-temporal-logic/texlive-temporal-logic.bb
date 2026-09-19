SUMMARY = "Symbols for Temporal Logics"
DESCRIPTION = "This package defines functions for rendering temporal operators \
defined in Linear Temporal Logic (LTL), Metric Temporal Logic \
(MTL), Metric First-order Temporal Logic (MFOTL), and the \
Counting Metric First-order Temporal Binding Logic (CMFTBL). \
The package defines various functions with variants in order to \
include or omit optional parameters of the operators like the \
optional interval."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77281"

RPM_NAME = "texlive-temporal-logic-2026.227.1.1svn77281-62.2.noarch.rpm"
RPM_HASH = "6a234f9dfc142811e08b83f9bbc37246a8b40b31f9c51b0d3d4e96774a426ebff8120f67a3a8317730d5c8bc371c67a4f18c460e8c18ed8b0734594960c2d6e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-temporal-logic.sty \
texlive-temporal-logic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
