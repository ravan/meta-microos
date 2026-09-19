SUMMARY = "Library for C path functions"
DESCRIPTION = "A library for C path functions. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcpath1-20260703-1.2.aarch64.rpm"
RPM_HASH = "dd78f9453fd66200a37fed9a3eed8d5f84661ee4cf303b05affda859672863243bff03f9187249d3c610e5f745e783ed1a3e59473841258d803be5de8edef647"

RPROVIDES:${PN} += "libcpath.so.1 \
libcpath1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcsplit.so.1 \
libuna.so.1"

inherit rpm
