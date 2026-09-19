SUMMARY = "Packages for language-dependent inline quotes and dashes"
DESCRIPTION = "The bundle contains two packages: quoted, for inserting \
quotation marks; and onedash, for inserting dashes. Each \
package takes a language name as an option; accepted language \
options are american, british, german and polish."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-logical-markup-utils-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "3a1ee992dcbcfa8b859eecd1e2d4dbe682f348f59744bb062d3e8a1892dae76d874b8c60c82177c2d2bd84dcce22f26efef4cb9807dcc96e47894c7e574c116b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onedash.sty \
tex-quoted.sty \
texlive-logical-markup-utils"

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
