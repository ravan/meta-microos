SUMMARY = "Shared library for vdt"
DESCRIPTION = "This package provides the shared library for vdt."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "libvdt0-0.4.4-3.6.aarch64.rpm"
RPM_HASH = "78b45ec341ef6d8d06ab86b1835dafa6621086f5f2c267341944cfa38e041cac71756e18ec8ea3fd1eb09cea435a20ec111b2c7ebfa9a0fa7276cf68689146d0"

RPROVIDES:${PN} += "libvdt.so.0 \
libvdt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
