SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libpcap-devel-1.10.7-1.1.aarch64.rpm"
RPM_HASH = "357a602fa5d70d65d6703f17a294598f6f0997f871e0a96df27c5a2481f9a713045c764167e201554afb0b56fcfad439779b7e884f2d6a1bf5c27f2dcaa5f298"

RPROVIDES:${PN} += "libpcap-devel \
pkgconfig-libpcap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpcap1 \
pkgconfig-dbus-1 \
pkgconfig-libnl-genl-3.0"

inherit rpm
