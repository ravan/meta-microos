SUMMARY = "Distributed Compilation in the Network"
DESCRIPTION = "Distributed compiler with a central scheduler to share build load."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-1.4.0-4.6.aarch64.rpm"
RPM_HASH = "d68f082913dbac6970124259966e59dbd06e15fee088cbdd46f6dd6b788ecc94cec94466bb663c5b3af7204d871771ac779d9f7d7f4e4d39955d98d56548ec2e"

RPROVIDES:${PN} += "config-icecream \
group-icecream \
icecream \
user-icecream"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bzip2 \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/tar \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
fillup \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
liblzo2.so.2 \
libstdc++.so.6 \
libzstd.so.1 \
logrotate \
systemd"

inherit rpm
