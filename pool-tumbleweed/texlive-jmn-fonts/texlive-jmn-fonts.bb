SUMMARY = "Severed fonts for texlive-jmn"
DESCRIPTION = "The  separated fonts package for texlive-jmn"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45751"

RPM_NAME = "texlive-jmn-fonts-2026.226.svn45751-63.2.noarch.rpm"
RPM_HASH = "c3c338e919838f6b90ac3a21b4b8b70ccdb9e6d39e7eaa2c80a5303e6b6f27262e20cbbf9ce82299035f3a69947329c22084aa360eb81f4595109e17a93874f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-hans \
font-hans-sh \
texlive-jmn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
