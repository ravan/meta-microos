SUMMARY = "Library to manage UEFI variables"
DESCRIPTION = "Library to allow for the simple manipulation of UEFI variables."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "libefivar1-38-3.9.aarch64.rpm"
RPM_HASH = "6e89c116e231633167010de5afb60340c82a4eb34721a88cdd792ff1eb7cdae6ae0bd06cff1cc0271a8c941a173f541ef183d409ab3ee2b2f8a473332dfb6481"

RPROVIDES:${PN} += "libefiboot.so.1 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
