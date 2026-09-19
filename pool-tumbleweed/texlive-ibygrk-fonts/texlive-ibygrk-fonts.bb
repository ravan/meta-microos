SUMMARY = "Severed fonts for texlive-ibygrk"
DESCRIPTION = "The  separated fonts package for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.5svn15878"

RPM_NAME = "texlive-ibygrk-fonts-2026.226.4.5svn15878-60.2.noarch.rpm"
RPM_HASH = "2329eb891173ef1978d2c72f9174ba618bff3233503b8f7b36efbedcf509f9d3a7c4e724ba3b4eab1b360e83fc771696380c486a46b91871aba8b37466ed8362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-ibycushtgpolytonicgreek \
texlive-ibygrk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
