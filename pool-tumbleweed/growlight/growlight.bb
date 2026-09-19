SUMMARY = "Disk manipulation and system setup tool"
DESCRIPTION = "growlight can manipulate both physical (NVMe, SATA, etc.) and virtual (mdadm, \
device-mapper, etc.) block devices, help identify bottlenecks in a storage \
topology, create and destroy filesystems, and prepare a machine for initial \
boot when run in an installer context. Both full-screen and REPL readline UIs \
are available."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.41"

RPM_NAME = "growlight-1.2.41-1.4.aarch64.rpm"
RPM_HASH = "31aad015ccc4720e73cc5927614be4b80f224063616226d091782995546b67cf0045854058cd34cbb1da934062c4385d1b9d7c050cb39ecbecb923e8edaf7f2c"

RPROVIDES:${PN} += "growlight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcryptsetup.so.12 \
libdevmapper.so.1.03 \
libnettle.so.8 \
libnotcurses-core.so.3 \
libpci.so.3 \
libpciaccess.so.0 \
libudev.so.1 \
libz.so.1"

inherit rpm
