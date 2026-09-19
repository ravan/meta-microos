SUMMARY = "Transactional Installation Kit"
DESCRIPTION = "A toolkit for deploying Operating System images to UEFI hardware from a USB stick."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-1.5.1-3.1.noarch.rpm"
RPM_HASH = "4d6873c02dcf9ef7b5c839832b6d964c8eefef22e620f41dcc7aaacd9abb9812764c195ca909fb9086148efcbde7bd3ffb8892e774a8236d3a576558c6cea24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils \
dbus-1-tools \
efibootmgr \
grep \
pkexec \
pv \
tik-config \
util-linux \
util-linux-systemd \
xz \
zenity"

inherit rpm
