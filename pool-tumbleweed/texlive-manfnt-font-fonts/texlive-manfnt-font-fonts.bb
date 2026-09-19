SUMMARY = "Severed fonts for texlive-manfnt-font"
DESCRIPTION = "The  separated fonts package for texlive-manfnt-font"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn45777"

RPM_NAME = "texlive-manfnt-font-fonts-2026.226.svn45777-59.2.noarch.rpm"
RPM_HASH = "7acbc53cf68def9fe4f9ffa11ee796a08fb84ad65cda053124772a35c7f84047d9774b7b51e18619272f605c46e2c3b6daebb4bdae0404f28922bba4c943aa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-manfnt \
texlive-manfnt-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
