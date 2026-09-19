SUMMARY = "Library for AD9361"
DESCRIPTION = "This is a simple library used for userspace, which manages multi-chip sync, on \
platforms (FMCOMMS5) where multiple AD9361 devices are used."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libad9361-0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "9034831a1c4d24ea20de5bb44ccee4df25d8c8a12467d33b7082f9212a40eead788950f5ef37ff5d55dfdddac44790e10ce7e93200a673767d113c196707e181"

RPROVIDES:${PN} += "libad9361-0 \
libad9361.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libiio.so.0 \
libm.so.6"

inherit rpm
