SUMMARY = "LIRC development files"
DESCRIPTION = "LIRC is a package that supports receiving and sending IR signals with \
the most common IR remote controls. It contains a daemon that decodes \
and sends IR signals, a mouse daemon that translates IR signals to \
mouse movements, and a couple of user programs that allow you to \
control your computer with a remote control."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-devel-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "b7fd2daa475f8e10c650c6e56fe7e34f689f79546737c32014276387dd67d36d86695463731d4e92589c78008b7d4b673fd6a104e471a25a8d947c88bf2d7542"

RPROVIDES:${PN} += "lirc-devel \
pkgconfig-lirc \
pkgconfig-lirc-driver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libirrecord0 \
liblirc-client0 \
liblirc-driver0 \
liblirc0"

inherit rpm
