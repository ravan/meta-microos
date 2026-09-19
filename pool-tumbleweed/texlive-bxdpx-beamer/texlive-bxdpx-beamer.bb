SUMMARY = "Dvipdfmx extras for use with beamer"
DESCRIPTION = "The package is a driver to support beamer Navigation symbols \
and \\framezoomed regions when using dvipdfmx as PDF generator \
(e.g., as part of e-pTeX). The package does not define any \
'user' commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-2026.226.0.0.3svn41813-59.2.noarch.rpm"
RPM_HASH = "4e275c24be75c5a7386bbb2153cb399512579076f2950299924607a31e223f124b94a9338cc5a9776a3bdab4578d849979bbba5e0496fbb66ca90a5071b180f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdpx-beamer.sty \
texlive-bxdpx-beamer"

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
