SUMMARY = "Tool for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "tukit is a simple tool to make changes to a system in an atomic way \
with btrfs and snapshots."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "tukit-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "08d57a35a35512a749e97cee39efc21a7cf2f9298bb9d102de6a084ac739321836e0cafbc69884d55192f386096df83acb59045af69b80243bf51650229ae9ed"

RPROVIDES:${PN} += "tukit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librpm.so.10 \
libselinux.so.1 \
libstdc++.so.6 \
libtukit.so.8 \
libtukit8"

inherit rpm
