SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "libnetfilter_conntrack-devel-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "4f71189226b5e9c193c886df89ac1a2751cd0a34bcc7698266f6091c8dc27e0b37041bd521949bd4e777eeb9a0c423ec54c5375c323be620a521c8125aeccde0"

RPROVIDES:${PN} += "libnetfilter-conntrack-devel \
pkgconfig-libnetfilter-conntrack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-conntrack3 \
pkgconfig-libnfnetlink"

inherit rpm
