SUMMARY = "LVM locking daemon"
DESCRIPTION = "LVM commands use lvmlockd to coordinate access to shared storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38"

RPM_NAME = "lvm2-lockd-2.03.38-2.6.aarch64.rpm"
RPM_HASH = "5a37dd36fc35ed82864a95a74fedd4cf66a3d5259f43446a490ae550e8382b72b546ebe6a84f51b78bc05caae145447ffd69fd7fc68d5a2700800ad7de6134eb"

RPROVIDES:${PN} += "lvm2-lockd"

RDEPENDS:${PN} += "/usr/bin/sh \
corosync \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlm \
libdlm-lt.so.3 \
libdlmcontrol.so.3 \
libsanlock-client.so.1 \
libsystemd.so.0 \
libudev.so.1 \
lvm2 \
sanlock \
systemd"

inherit rpm
