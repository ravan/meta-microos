SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.42.2"

RPM_NAME = "util-linux-systemd-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "5f733f928b977b31ddc95e8a91074da64b11f1a62a77a7a60d35a59cef8a9690475a417549b98df89e193cd372f9a4de8858db283a80b7bb897a6468b01b93ca"

RPROVIDES:${PN} += "/usr/bin/logger \
util-linux-/bin/logger \
util-linux-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libeconf.so.0 \
liblastlog2.so.2 \
libmount.so.1 \
libselinux.so.1 \
libsmartcols.so.1 \
libsystemd.so.0 \
libtinfo.so.6 \
libudev.so.1 \
permissions \
systemd"

inherit rpm
