SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.14"

RPM_NAME = "net6-devel-1.3.14-13.9.aarch64.rpm"
RPM_HASH = "4896f55c3620e957e596057ba1ed77becf380d06e066ed06c7e8a32b10ee1695e132a4bde8948a6efc5de68041ead3a62fd171de2487639a586a68fd4974b88e"

RPROVIDES:${PN} += "net6-devel \
pkgconfig-net6-1.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libsigc++2-devel \
net6 \
pkgconfig-sigc++-2.0"

inherit rpm
