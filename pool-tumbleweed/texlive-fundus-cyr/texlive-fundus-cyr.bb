SUMMARY = "Support for Washington University Cyrillic fonts"
DESCRIPTION = "The package supports the use of the Washington Cyrillic fonts \
with LaTeX (Note that standard LaTeX has support, too, as \
encoding OT2). The package is distributed as part of the fundus \
bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn26019"

RPM_NAME = "texlive-fundus-cyr-2026.226.svn26019-60.2.noarch.rpm"
RPM_HASH = "64777fb37613ccbdb7df50332955a1701b228c4cf2664f9302e6e1a208a5cc64b011202f395bdd0fdba959f0ff4afb8e905e480f5bddaafa412f997d3e5e3043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cyr.sty \
texlive-fundus-cyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cyracc.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
