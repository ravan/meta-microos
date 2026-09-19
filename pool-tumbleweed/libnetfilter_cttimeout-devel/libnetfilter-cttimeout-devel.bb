SUMMARY = "Userspace library for the Netfilter Conntrack Timeout extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended timeout settings infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cttimeout-devel-1.0.1-1.15.aarch64.rpm"
RPM_HASH = "3b256b208a175c94ee8fd81af92a1c82c0ceb85a3f73be0a9ffd580bd85411c46690277c571650e51b45e14a63b50165dc7a95cccb3697434df2debeb9bab210"

RPROVIDES:${PN} += "libnetfilter-cttimeout-devel \
pkgconfig-libnetfilter-cttimeout"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-cttimeout1"

inherit rpm
