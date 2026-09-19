SUMMARY = "Typeset recipes"
DESCRIPTION = "The package typesets recipes according to the style used in a \
well-respected German cookery book."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-2026.226.0.0.9bsvn15878-61.2.noarch.rpm"
RPM_HASH = "4b26b7b926f377b34f820a790bb824f94d863c305a65f316fd0ad90d5f4874111cbdd7ae3614fd05384e58759590afbde77ee038b1e672fe5be3ad052ca761b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooking.sty \
texlive-cooking"

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
