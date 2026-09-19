SUMMARY = "A clean and minimalist Beamer theme"
DESCRIPTION = "This package provides a clean and minimalist Beamer theme \
designed for professional and academic presentations. It \
separates style components into modular .sty files for \
flexibility and clarity."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0.3svn74971"

RPM_NAME = "texlive-beamertheme-cleaneasy-2026.226.1.0.3svn74971-61.2.noarch.rpm"
RPM_HASH = "800c4032a11acc8f502a52f63543bf26feb9e49ad02e292f5dea85e9af944eec8cd048df1dd3a44ef145e4bdadc7518e263584280d338bee478fb41daa1ef619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeCleanEasy.sty \
tex-beamerfontthemeCleanEasy.sty \
tex-beamerinnerthemeCleanEasy.sty \
tex-beamerouterthemeCleanEasy.sty \
tex-beamerthemeCleanEasy.sty \
texlive-beamertheme-cleaneasy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbright.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
