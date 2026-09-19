SUMMARY = "Probes disks on the system for installed operating systems"
DESCRIPTION = "This package detects other OSes available on a system and outputs the results \
in a generic machine-readable format. Support for new OSes and Linux \
distributions can be added easily."
LICENSE = "GPL-2.0-or-later"

PV = "1.81"

RPM_NAME = "os-prober-1.81-3.4.aarch64.rpm"
RPM_HASH = "976c47bd54155232d36c285007bd8395afc9e00f96a2fceb35421a22f421112d2f3f4acaf8a1789d03c30f6247c1b515d03fb05cccc4ac6e33a6a6b3d5de8b56"

RPROVIDES:${PN} += "os-prober"

RDEPENDS:${PN} += "/sbin/modprobe \
/usr/bin/grep \
/usr/bin/sed \
/usr/bin/sh \
coreutils \
libc.so.6 \
udev \
util-linux \
util-linux-systemd"

inherit rpm
