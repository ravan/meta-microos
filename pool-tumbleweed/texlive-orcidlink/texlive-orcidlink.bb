SUMMARY = "Insert hyperlinked ORCiD logo"
DESCRIPTION = "This package provides a command to insert the ORCiD logo, which \
is hyperlinked to the URL of the researcher whose iD was \
specified."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77682"

RPM_NAME = "texlive-orcidlink-2026.226.1.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "156d7ff8f82422f69b5538285677fcaccebcf8800931411ebd6dd205ce1860128c137f232a9bd2ab5ae9e7f59a17dd8332ef2a0ce59498402c00edafceb78ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orcidlink.sty \
texlive-orcidlink"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
