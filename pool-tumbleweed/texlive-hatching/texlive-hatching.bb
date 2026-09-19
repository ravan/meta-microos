SUMMARY = "MetaPost macros for hatching interior of closed paths"
DESCRIPTION = "The file hatching.mp contains a set of MetaPost macros for \
hatching interior of closed paths. Examples of usage are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.11svn23818"

RPM_NAME = "texlive-hatching-2026.226.0.0.11svn23818-60.4.noarch.rpm"
RPM_HASH = "9b0da86cccf6f91d45d7548a0ddfea2650becb337a7b2a4cc07cacae9c2f391aa05a4c41713fba011b7c94b79c5a5bbb0190b92e6c7057b0bd452073b3d61d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching"

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
