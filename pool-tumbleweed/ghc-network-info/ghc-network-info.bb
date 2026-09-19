SUMMARY = "Access the local computer's basic network configuration"
DESCRIPTION = "This library provides simple read-only access to the local computer's \
networking configuration. It is currently capable of getting a list of all the \
network interfaces and their respective IPv4, IPv6 and MAC addresses. \
 \
network-info has been tested and is known to work on Ubuntu, FreeBSD, NetBSD, \
Mac OS and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-0.2.1-2.21.aarch64.rpm"
RPM_HASH = "bbeda6b1797c7be1ae332e5bf0d6cd06c87261fc8caad0ba69f1c1621d3b896aa8c04d28ff0194714c033254fa09a705fa7ac1c8f98ec9e62cfa6cb49487c8d1"

RPROVIDES:${PN} += "ghc-network-info \
libHSnetwork-info-0.2.1-I1lcnyergC0DdfN7xa3e0a-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
