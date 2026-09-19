SUMMARY = "Create images of dice with one, two, or three faces showing, using MetaPost"
DESCRIPTION = "The package provides MetaPost code to create all possible \
symmetrical views (up to rotation) of a right-handed die. \
Configuration is possible by editing the source code, following \
the guidance in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn20675"

RPM_NAME = "texlive-threeddice-2026.227.1.0svn20675-62.2.noarch.rpm"
RPM_HASH = "393f56fe49c4bcbcfff6738136d3d2c20c6be6dee9f552e0d7a1a0a26922cfec553ab12fab80680e36cdfa5c385dc1077481043fba9cb49b1fdb3374c8ea5689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice"

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
