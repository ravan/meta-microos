SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - mdns support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "libgensiomdns14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "ee11af52bb2afa44982126baed300f0fdce376cb29a2e07efec93d1269d7cdfbea806e4521977ae986e64b90613e72f0ec3c1a35b9b9417a1ef665599f1b950b"

RPROVIDES:${PN} += "libgensiomdns.so.14 \
libgensiomdns14 \
libgensiomdnscpp.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgensioosh.so.14 \
libgensiooshcpp.so.14 \
libstdc++.so.6"

inherit rpm
