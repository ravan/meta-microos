SUMMARY = "Ceph distributed file system headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use Ceph distributed file system."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "libcephfs-devel-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "0b8713f157c98a945b0e555ed4bb7fbf3c5b617beceff872d226cacd44ffcec636bfae73065ffd1df39d21e6a3ecc87dd4002cdcbb6375e7aedea9569ef594d6"

RPROVIDES:${PN} += "libcephfs-devel \
libcephfs2-devel"

RDEPENDS:${PN} += "libcephfs2 \
librados-devel"

inherit rpm
