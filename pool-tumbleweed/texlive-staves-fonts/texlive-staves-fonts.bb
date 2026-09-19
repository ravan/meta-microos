SUMMARY = "Severed fonts for texlive-staves"
DESCRIPTION = "The  separated fonts package for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-staves-fonts-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "63ebfa0fcfc2b023fe153c7311e30ae3fa7cce04cf2072a093b577c404a2f6f892e02e9c021b33d51ae14c25ef902c511950b81f68ddd091c127efb0461c698c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-icelandic \
texlive-staves-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
