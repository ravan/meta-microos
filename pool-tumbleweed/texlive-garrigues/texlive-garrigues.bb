SUMMARY = "MetaPost macros for the reproduction of Garrigues' Easter nomogram"
DESCRIPTION = "MetaPost macros for the reproduction of Garrigues' Easter \
nomogram. These macros are described in Denis Roegel: An \
introduction to nomography: Garrigues' nomogram for the \
computation of Easter, TUGboat (volume 30, number 1, 2009, \
pages 88-104)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-garrigues-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "7c5dded0baef1ea5e389eff71eebc5ce77eea03f86f126a2598a15a3c3b1649d5138f2be156e0b228928b6ab880628cc10fe00ce5920d7f604149e18fafa69df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues"

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
