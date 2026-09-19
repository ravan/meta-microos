SUMMARY = "Core Pacemaker libraries"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-libs package contains shared libraries needed for cluster \
nodes and those just running the CLI tools."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-libs-3.0.3+20260728.7052efa194-1.1.aarch64.rpm"
RPM_HASH = "0333429ba598a3ec45a540cc8d7df81fc9e54ede765fd119b1a99eaabad5ca49bfb0955c91286457114f7e0a12f7c0684a6ebcf837cfef019053963d153fd238"

RPROVIDES:${PN} += "group-haclient \
group-hacluster \
libcib.so.54 \
libcrmcluster.so.53 \
libcrmcommon.so.68 \
libcrmservice.so.53 \
liblrmd.so.52 \
libpacemaker.so.30 \
libpacemaker3 \
libpe-rules.so.51 \
libpe-status.so.56 \
libstonithd.so.56 \
pacemaker-libs \
user-hacluster"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcmap.so.4 \
libcpg.so.4 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libqb.so.100 \
libquorum.so.5 \
libuuid.so.1 \
libxml2.so.16 \
libxslt.so.1 \
pacemaker-schemas \
shadow \
sysuser-shadow"

inherit rpm
