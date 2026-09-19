SUMMARY = "Display list item counter as regular pattern of bullets"
DESCRIPTION = "The bullcntr package defines the command bullcntr, which may be \
thought of as an analogue of the \\fnsymbol command: like the \
latter, it displays the value of a counter lying between 1 and \
9, but uses, for the purpose, a regular pattern of bullets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-2026.226.0.0.04svn15878-59.2.noarch.rpm"
RPM_HASH = "21f182ec8f6df0ae105595cbc85e5c0435d610e5b39d4e3a76c94e5415a53dbb38be81b164c412656f4395d1d74cb545134bb2f6f4b9250e8aeef40106c5a1c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bullcntr.sty \
tex-bullenum.sty \
texlive-bullcntr"

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
