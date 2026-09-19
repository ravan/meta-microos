SUMMARY = "'Chicago' bibliography style that allows annotations"
DESCRIPTION = "This bibliography style is intended to extend the 'Chicago' \
bibliography style so that it can be annotated and at the same \
allowing DOI and URL fields."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76790"

RPM_NAME = "texlive-chicagolinks-2026.226.2.1svn76790-60.2.noarch.rpm"
RPM_HASH = "92108171325a9d8af3f2ddf5123887764860688c37a014609fb807a88b972062606b925946e16da2ef8c5e8c615868b65f6015b9c21e6754bc6cb4c45c41f0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicagolinks"

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
