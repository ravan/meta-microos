SUMMARY = "Linux iSCSI Software Initiator"
DESCRIPTION = "This is a transport independent implementation of RFC 3720 \
iSCSI. It is partitioned into user and kernel parts. \
 \
The kernel portion of Open-iSCSI implements the iSCSI data path (that \
is, iSCSI Read and iSCSI Write), and consists of two loadable \
modules: iscsi_if.ko and iscsi_tcp.ko, and is now is delivered \
as part of the kernel. \
 \
The user-space part contains the entire control plane: configuration \
manager, iSCSI Discovery, Login and Logout processing, \
connection-level error processing, Nop-In and Nop-Out handling. It \
comes with a daemon process called iscsid, and a management utility, \
iscsiadm."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.12"

RPM_NAME = "open-iscsi-2.1.12-113.1.aarch64.rpm"
RPM_HASH = "543a21d4141e56c22b7cab14223bbd7434c180efc8a27a520125f1bff8e4b0de8c775d8062084e299d15924f56bbe21434128fda5693368567c7562d21f63ca6"

RPROVIDES:${PN} += "config-open-iscsi \
open-iscsi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libisns.so.0 \
libkmod.so.2 \
libmount.so.1 \
libopeniscsiusr.so.0 \
libopeniscsiusr0 \
libsystemd.so.0 \
systemd"

inherit rpm
