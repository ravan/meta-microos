SUMMARY = "A top(1) like utility for Ceph Filesystem"
DESCRIPTION = "This package provides a top(1) like utility to display Ceph Filesystem metrics \
in realtime."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "cephfs-top-18.2.7-8.1.noarch.rpm"
RPM_HASH = "3a451660ebb202df1827087a68086bc6f45d151c773ed277df3499d13e7a6469edd1c0f3ef69eb4fabd371da30ac3160a2a6a7b8c5822ca60f49f7be515cff40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephfs-top \
python3.13dist-cephfs-top \
python3dist-cephfs-top"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-base \
python3-rados"

inherit rpm
