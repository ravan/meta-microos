SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "9a44f28a04972d590565ce068aab37d482b1c201de67accc4a153b61d7d9d8389d462e4523fbd3c9baf7a9701c4098d781df6e7e34876418f09b5a746e203a26"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt.so.0"

inherit rpm
