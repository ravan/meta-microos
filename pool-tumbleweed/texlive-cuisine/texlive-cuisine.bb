SUMMARY = "Typeset recipes"
DESCRIPTION = "Typeset recipes with the ingredients lined up with their method \
step (somewhat similarly to the layout used in cooking)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-2026.226.0.0.7svn34453-61.2.noarch.rpm"
RPM_HASH = "14af840e3e03b24ce4aeb60fc5b50f582681b669e8d9c39305393d47ee084b4007972753b04fb008c130d2bf95dcaf14ac746a8aae06165bb03c9af02587fb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cuisine.sty \
texlive-cuisine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nicefrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
