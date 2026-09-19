SUMMARY = "FFI library for variadic argument functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows calling C functions with variable argument \
prototypes."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "libavcall1-2.5-1.9.aarch64.rpm"
RPM_HASH = "4931505fd6497cd51e5c9964c3f7d0b7bc5a6e61924456df7dee4403f765b8dd3249569042779db3ee7ff32720c4f9cffd1ba446154911dd59df815c7da960b4"

RPROVIDES:${PN} += "libavcall.so.1 \
libavcall1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
