SUMMARY = "Shared libraries for tolua"
DESCRIPTION = "This package provides shared libraries for tolua."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.4"

RPM_NAME = "libtolua5-5.2.4-5.9.aarch64.rpm"
RPM_HASH = "a00c52d1ac52ea1b800cd6894ca97a22c4c6ada35f9bd56f3d6f70a32681e14fbb03c7b8329a618422762bab5e84327badd8796a65e042386cde365faa102f1e"

RPROVIDES:${PN} += "libtolua.so.5 \
libtolua5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
