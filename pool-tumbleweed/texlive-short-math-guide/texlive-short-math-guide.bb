SUMMARY = "Guide to using amsmath and related packages to typeset mathematical notation with LaTeX"
DESCRIPTION = "The Short Math Guide is intended to be a concise introduction \
to the use of the facilities provided by amsmath and various \
other LaTeX packages for typesetting mathematical notation. \
Originally created by Michael Downes of the American \
Mathematical Society based only on amsmath, it has been brought \
up to date with references to related packages and other useful \
information."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn46126"

RPM_NAME = "texlive-short-math-guide-2026.226.2.0svn46126-60.2.noarch.rpm"
RPM_HASH = "3ea833ca9cb5e844f4f513777add27dc40a559d95f1a352509e1f8e4e81a12ebf8c94a78d4501b9c5e361f8f4a3cc6c5bbf00213a4448cfc3d99c3cd55d8b780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-short-math-guide"

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
