SUMMARY = "A shared disk lock manager"
DESCRIPTION = "sanlock uses disk paxos to manage leases on shared storage. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "sanlock-5.1.0-2.3.aarch64.rpm"
RPM_HASH = "f18894ee9650955d56bf6d8e6c7153086eb999bd6397c857a8b4cbe956eb1f0cd74f92e3ba94d752d8926cfa75faa50802434eadc4f8d2460cbc685883aeaa0a"

RPROVIDES:${PN} += "config-sanlock \
group-sanlock \
sanlock \
user-sanlock"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-disk \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libsanlock.so.1 \
libuuid.so.1 \
libwdmd.so.1 \
shadow \
systemd"

inherit rpm
