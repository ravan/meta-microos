SUMMARY = "top-like program showing Netfilter connection tracking entries"
DESCRIPTION = "cttop is a top-like program that shows netfilter connection tracking \
entries. entries can be sorted by various criteria and grouped, e.g. \
by source address."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.g26"

RPM_NAME = "cttop-0.3.g26-3.25.aarch64.rpm"
RPM_HASH = "dba8109624b384a03f51b076e592ef77eb742b9247c3a3a5b0c64bcbd75f4852e4160a6558034dee716890adb344b4ddfeac474e15418a9b3bb253f442878682"

RPROVIDES:${PN} += "cttop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libncurses.so.6 \
libnetfilter-conntrack.so.3 \
libnfnetlink.so.0 \
libtinfo.so.6"

inherit rpm
