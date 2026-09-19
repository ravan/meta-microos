SUMMARY = "Calculate inverse file paths"
DESCRIPTION = "The package calculates inverse relative paths. Such things may \
be useful, for example, when writing an auxiliary file to a \
different directory."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-inversepath-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "06570dd47b6e0562ee0d1b9e4184b7d9b73023ebbdfb34b054bfe2d4d505b16605ac54b497c0b08d0d7d98e49dfbae702ab4e95ce1fffc4ac9521ee5f90e411c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inversepath.sty \
texlive-inversepath"

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
