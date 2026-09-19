SUMMARY = "Libertinus font family"
DESCRIPTION = "Libertinus font family: serif, sans and mono. It is a fork of the Linux Libertine font family."
LICENSE = "OFL-1.1"

PV = "7.051"

RPM_NAME = "libertinus-fonts-7.051-1.6.noarch.rpm"
RPM_HASH = "3d1b5588be40507260df0d82cd89247c41c537c8c2d40eaa36569b2ac3514c9d4bf2a1dc72680200106fde0b47873473145ad789e1b5ffdc625726b7868f75fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libertinus-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
