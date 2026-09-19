SUMMARY = "Create illustrations for network protocol specifications"
DESCRIPTION = "The bytefield package helps the user create illustrations for \
network protocol specifications and anything else that utilizes \
fields of data. These illustrations show how the bits and bytes \
are laid out in a packet or in memory."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-bytefield-2026.226.2.9svn77682-59.2.noarch.rpm"
RPM_HASH = "95292cf377e0763fa5585ed16969ee3d4aa69ecc543d64afa8059c0f5d348f4d49ae65d29fbec5400dfefd1522ec02c7535037947c25404177b2c4f04f9a1724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bytefield.sty \
texlive-bytefield"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
