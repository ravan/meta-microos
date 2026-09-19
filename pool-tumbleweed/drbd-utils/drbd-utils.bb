SUMMARY = "Distributed Replicated Block Device"
DESCRIPTION = "Drbd is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.29.0"

RPM_NAME = "drbd-utils-9.29.0-10.7.aarch64.rpm"
RPM_HASH = "c24cbef223fd15b8ffc06fb0f628504d37c16b0c4f4a1b6dac92949e9a5736e23787ac1ae3e41687b0316d56e55692f34ab69b6d6e234c759df430cb265352eb"

RPROVIDES:${PN} += "config-drbd-utils \
drbd-bash-completion \
drbd-control \
drbd-pacemaker \
drbd-udev \
drbd-utils \
drbdsetup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
