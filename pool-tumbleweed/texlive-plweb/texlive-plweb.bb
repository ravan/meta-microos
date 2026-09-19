SUMMARY = "Literate Programming for Prolog with LaTeX"
DESCRIPTION = "Instead of having to transform the common source into program \
or documentation, the central idea was to develop a method to \
have one common source which can be interpreted by a Prolog \
system as well as by LaTeX, whether that Prolog system be \
C-Prolog, Quintus-Prolog, or ECLiPSe."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn15878"

RPM_NAME = "texlive-plweb-2026.226.3.0svn15878-59.2.noarch.rpm"
RPM_HASH = "c08b66b46f3e0a3a6d7e796c1d0ddf3eb1a921a92b3007e50d889f1ac62e296c2439f06c557c3176b4b57a500c1144c27b2d79a685683204deead7343b9844ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pcode.sty \
tex-pl.cfg \
tex-pl.sty \
texlive-plweb"

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
