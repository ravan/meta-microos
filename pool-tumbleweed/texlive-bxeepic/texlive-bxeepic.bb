SUMMARY = "Eepic facilities using pict2e"
DESCRIPTION = "The package provides an eepic driver to use pict2e facilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bxeepic-2026.226.0.0.2svn77682-59.2.noarch.rpm"
RPM_HASH = "2433ddd10bdb0c504c39ce889553ec03cb01936d21aedb7ef465083b3dcfe79db6079ef313052c910f069eb54bf9be5f7db33e81fec2df6eeb81e831117b87ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdpxp2e.def \
tex-bxeepic.sty \
texlive-bxeepic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
