SUMMARY = "SELinux sandbox helper"
DESCRIPTION = "Run an application within a tightly confined SELinux domain. The default \
sandbox domain only allows applications the ability to read and write stdin, \
stdout and any other file descriptors handed to it."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "selinux-sandbox-3.11-3.1.aarch64.rpm"
RPM_HASH = "cbd5c2ee93d5d7de699a0c48b39aaf93268dad023ff2a23334b6b01b49a6f5cfc9223d084eb0f6fd2faba03103388bb7c5e78a7a8d4a3f2dea18c322ef9e2933"

RPROVIDES:${PN} += "policycoreutils-sandbox \
selinux-sandbox"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libselinux.so.1 \
permissions \
python3-policycoreutils \
python3-selinux \
rsync \
selinux-policy-sandbox \
xmodmap"

inherit rpm
