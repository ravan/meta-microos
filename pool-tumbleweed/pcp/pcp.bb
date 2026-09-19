SUMMARY = "System-level performance monitoring and performance management"
DESCRIPTION = "Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The PCP open source release provides a unifying abstraction for all of \
the interesting performance data in a system, and allows client \
applications to easily retrieve and process any subset of that data."
LICENSE = "GPL-2.0+ & LGPL-2.0+ & CC-BY-SA-3.0"

PV = "6.3.8"

RPM_NAME = "pcp-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "21a3003996fcceae34f2aa812e0e1e811ba7125a6d176905d81a3ba5b32ca84f0f6961a986c1af5440a982d8ee8765a583907b396ae4ebe9d797eb6dec83ecba"

RPROVIDES:${PN} += "config-pcp \
group-pcp \
libpcp-archive.so.1 \
pcp \
pcp-manager \
pcp-manager-debuginfo \
pcp-pmda-kvm \
pcp-pmda-nvidia \
pcp-webapi \
pcp-webapi-debuginfo \
pkgconfig-libpcp-archive \
user-pcp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/pkg-config \
/usr/bin/sh \
/usr/bin/which \
bash \
cpp \
cyrus-sasl \
fileutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpcp-gui.so.2 \
libpcp-import.so.1 \
libpcp-mmv.so.1 \
libpcp-pmda.so.3 \
libpcp-trace.so.2 \
libpcp-web.so.1 \
libpcp.so.3 \
libpcp3 \
libreadline.so.8 \
libssl.so.3 \
libtinfo.so.6 \
libuv.so.1 \
libz.so.1 \
perl \
sed \
systemd"

inherit rpm
