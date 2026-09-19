SUMMARY = "A constant time/expandable switch/case"
DESCRIPTION = "This package defines two commands (and aliases) aimed at \
implementing a constant time switch/case alike command."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn77050"

RPM_NAME = "texlive-switch-2026.226.1.1bsvn77050-64.2.noarch.rpm"
RPM_HASH = "4777245004ec3639e534f5992173d5d0faf26957cfe78993a4a8a663b43091fb581df288c6073901729468242f4db7dd00c2c8d816a630cc35207bf0c8288e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-switch.sty \
texlive-switch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
