SUMMARY = "Severed fonts for texlive-frederika2016"
DESCRIPTION = "The  separated fonts package for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2026.226.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-fonts-2026.226.1.000_2016_initial_releasesvn42157-60.2.noarch.rpm"
RPM_HASH = "06329eec3ed9f70c9b5791d73f5745c09a8f902612f1d8f89087f84bbfdb9255a12c3996b8b948265d9bca8dee0b770ab441e2740f89a8fb5dfc9c05872805d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-frederika2016 \
texlive-frederika2016-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
