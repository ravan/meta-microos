SUMMARY = "A diagnostic tool for a TeX installation"
DESCRIPTION = "Provides macros to assist evaluation of the capabilities of a \
TeX installation (i.e., what extensions it supports). An \
example document that examines the installation is available."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-2026.226.0.0.2svn19387-59.2.noarch.rpm"
RPM_HASH = "4ae0097ea7ca2ae2e65866ae93f673313df82b4322d3a3aea841f4be3ae414d88999990f2b027b7bfd203f12ddcd78a5f34f76623a3ffdac29281d34ae54d3eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagnose.sty \
texlive-diagnose"

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
