SUMMARY = "Insert pictures into paragraphs"
DESCRIPTION = "A legacy package for creating 'windows' in paragraphs, for \
inserting graphics, etc. (including 'dropped capitals'). Users \
should note that Pieter van Oostrum (in a published review of \
packages of this sort) does not recommend this package; Picins \
is recommended instead."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-picinpar-2026.226.1.3asvn77682-58.2.noarch.rpm"
RPM_HASH = "1b4e9e0bd809106b352ad4fb24b2ccf2c6fcfdf26013f7a110df6cb470e60d258b628d4d6c1ccb51191c81447b6a05fd33c952678b0f67882fec73c39e8ef071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-picinpar.sty \
texlive-picinpar"

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
