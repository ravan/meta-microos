SUMMARY = "Severed fonts for texlive-mathpazo"
DESCRIPTION = "The  separated fonts package for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.003svn77682"

RPM_NAME = "texlive-mathpazo-fonts-2026.226.1.003svn77682-59.2.noarch.rpm"
RPM_HASH = "a87d7bc3c010dcb314c921cd2f215945736f038dfa9a1d18373a36b420fff84cf59c1ac41d2841f73873ef0d17c041deaa41d7deeed183237a8f9ec458d40ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pazomath \
font-pazomathblackboardbold \
texlive-mathpazo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
