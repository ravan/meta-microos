SUMMARY = "Interactive shell for Ceph file system"
DESCRIPTION = "This package contains an interactive tool that allows accessing a Ceph \
file system without mounting it  by providing a nice pseudo-shell which \
works like an FTP client."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "cephfs-shell-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "17688cafd127a63f42cff2f6e3a26f43ac0d72f48d8b921e9ebb3b0fac23c2005119935d9f985a7dbaf86a091064ef2bf82e28f2eceee2f3721b35d0868e2614"

RPROVIDES:${PN} += "cephfs-shell \
python3.13dist-cephfs-shell \
python3dist-cephfs-shell"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-cephfs \
python3-cmd2 \
python3-colorama"

inherit rpm
