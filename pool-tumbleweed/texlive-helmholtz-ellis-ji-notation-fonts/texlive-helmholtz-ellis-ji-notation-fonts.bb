SUMMARY = "Severed fonts for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "The  separated fonts package for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-fonts-2026.226.1.1svn55213-60.4.noarch.rpm"
RPM_HASH = "b469941b9099fe0d0eaf15391d2c22f93bd091728c518da1fc92dd5516a5eccc71e7c110fcfc1994aa9074ec2dbb23e4a3dc1bf0adf258ba8d850e62e4368cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
