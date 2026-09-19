SUMMARY = "Using graphics from PAW"
DESCRIPTION = "Support for the easy inclusion of graphics made by PAW (Physics \
Analysis Workstation). You need to have PAW installed on your \
system to benefit from this package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn21629"

RPM_NAME = "texlive-pawpict-2026.226.1.0svn21629-58.2.noarch.rpm"
RPM_HASH = "acf9d90a2e88e2f5b5dd814fadab6b30fd00a5c098a53503a9a2de3bd604ebda5355419f726e78ff466caa4c5df04e683dc2471098d8b9feafe3ffa27a91d8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pawpict.sty \
texlive-pawpict"

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
