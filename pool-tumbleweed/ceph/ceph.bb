SUMMARY = "User space components of the Ceph file system"
DESCRIPTION = "Ceph is a massively scalable, open-source, distributed storage system that runs \
on commodity hardware and delivers object, block and file system storage."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "9654c4e5a59813839804084efff85d8e92d5f11c296d6a6594ca0f0d5378d7785d66e76247869f4edb2dab6ae4cdd447db9f57960a4a8daf29a1c59c497cbc91"

RPROVIDES:${PN} += "ceph"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
binutils \
ceph-mds \
ceph-mgr \
ceph-mon \
ceph-osd \
fillup \
lua54-luarocks \
systemd"

inherit rpm
