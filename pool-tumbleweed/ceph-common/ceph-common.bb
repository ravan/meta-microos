SUMMARY = "Ceph Common"
DESCRIPTION = "Common utilities to mount and interact with a ceph storage cluster. \
Comprised of files that are common to Ceph clients and servers."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-common-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "8992bf9f8cca7c3cb28a72a04f94560b98123171c71b7cde948e8fc5789b94b326fe5fab8c19ca4706d5bf163ae2594171b0f5bb696bc355b7fe67fbefcb1dd8"

RPROVIDES:${PN} += "ceph-common \
config-ceph-common \
group-ceph \
user-ceph"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libceph-common.so.2 \
libcephfs.so.2 \
libcephfs2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libicuuc.so.78 \
libkeyutils.so.1 \
libldap.so.2 \
liblua5.4.so.5 \
libm.so.6 \
libncurses.so.6 \
liboath.so.0 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libtinfo.so.6 \
libudev.so.1 \
permissions \
python3-PrettyTable \
python3-ceph-argparse \
python3-ceph-common \
python3-cephfs \
python3-rados \
python3-rbd \
python3-rgw \
shadow \
systemd"

inherit rpm
