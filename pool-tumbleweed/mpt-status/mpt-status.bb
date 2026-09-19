SUMMARY = "Program Showing the Status of LSI 1030 RAID Controller"
DESCRIPTION = "This program shows the status of the physical and logical drives attached \
to a LSI 1030 RAID (mptlinux, fusion, mpt, ioc) controller."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "mpt-status-1.2.0-194.22.aarch64.rpm"
RPM_HASH = "9b7de990c245e22bc779484946ece55c30541d5a6887e51d10bc9aa6cc4f6dcb3e915d6ea7f6b6fa43d862852255e16b697d149b13ecb2612e54f660dd4de4d3"

RPROVIDES:${PN} += "mpt-status"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
