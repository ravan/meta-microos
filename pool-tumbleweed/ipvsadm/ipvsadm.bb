SUMMARY = "A Utility for Administering the Linux Virtual Server"
DESCRIPTION = "ipvsadm is a utility for administering the IP virtual server services \
offered by the Linux kernel with Linux Virtual Server support."
LICENSE = "GPL-2.0-or-later"

PV = "1.31"

RPM_NAME = "ipvsadm-1.31-3.12.aarch64.rpm"
RPM_HASH = "96f78e403f25d97d9dedcb24666ebf625530084e569f852f37341dff38ee30dc0d93742c8ef61b611eec5d6e84d0fa786942689f2217e14e387babf6c543212c"

RPROVIDES:${PN} += "config-ipvsadm \
ipvsadm \
ipvsadm-1.31"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpopt.so.0 \
systemd"

inherit rpm
