SUMMARY = "Libraries for the qore runtime and qore clients"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides the qore library required for all clients using qore \
functionality."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "libqore12-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "b49a74df6eca2ef8ff66d7a6e6a00564daa275728377c22cb21ca8e82cf7bcc3908bee298ed0ef6ffe34c10512b310d4287a5ced5704dda221a368c9e8e72c94"

RPROVIDES:${PN} += "libqore.so.12 \
libqore12 \
qore-module-abi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmpfr.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
