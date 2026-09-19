SUMMARY = "Patch to graphics driver for scaling in vertical direction of pTeX"
DESCRIPTION = "Patch for graphics driver 'dvipdfmx' to support correct scaling \
in vertical direction of Japanese pTeX/upTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-pxtatescale-2026.226.0.0.4svn77682-60.4.noarch.rpm"
RPM_HASH = "99c0e17397df5974965a43763cfc27fef7a33eebd8ff51d8697f62527b505155b3f6fafea34c7ad6ae9dbc95574de3241ef13d39e6a66fd8c056eaedf8949e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxtatescale.sty \
texlive-pxtatescale"

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
