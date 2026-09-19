SUMMARY = "Development files for libnftnl"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnftnl."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libnftnl-devel-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "b53762e59bf8eb360c79c2219f00f30a7b59767e8260bb378011b8625c4c3a31f5a6acda1be66529d67650a1119f86925b3e1acc24adea5a4b1a7e0ed45327c3"

RPROVIDES:${PN} += "libnftnl-devel \
pkgconfig-libnftnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftnl11 \
pkgconfig-libmnl"

inherit rpm
