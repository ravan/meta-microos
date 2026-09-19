SUMMARY = "Ceph OSD deployment and inspection tool"
DESCRIPTION = "This package contains a tool to deploy OSD with different devices like \
lvm or physical disks, and trying to follow a predictable, and robust \
way of preparing, activating, and starting the deployed OSD."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-volume-18.2.7-8.1.noarch.rpm"
RPM_HASH = "d18a9b0112ac969149521df2c1b990a215b773e0af3fa930ccfa0b3d131df3ae0657ed04ee1c738d0a89f4cf41ca949997acc197b182124f2f4864916547106e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-volume \
python3.13dist-ceph-volume \
python3dist-ceph-volume"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ceph-osd \
cryptsetup \
e2fsprogs \
lvm2 \
parted \
python-abi \
python3-ceph-common \
python3-packaging \
python3-setuptools \
util-linux \
xfsprogs"

inherit rpm
