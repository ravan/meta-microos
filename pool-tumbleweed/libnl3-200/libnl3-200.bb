SUMMARY = "Convenience library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.12.0"

RPM_NAME = "libnl3-200-3.12.0-1.5.aarch64.rpm"
RPM_HASH = "094aaefc60335708b89d7274a9777ed07909592c8adf25670444f11809cd98d3a5181939d0d31802f2774ae7da3fc8f3e2d99b00ddaae4ff7b53d63bc9b4b1ac"

RPROVIDES:${PN} += "libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-idiag-3.so.200 \
libnl-nf-3.so.200 \
libnl-route-3.so.200 \
libnl-xfrm-3.so.200 \
libnl3-200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-config"

inherit rpm
