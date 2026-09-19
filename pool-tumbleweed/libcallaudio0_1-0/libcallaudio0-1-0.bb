SUMMARY = "Shared library files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the shared library files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.99"

RPM_NAME = "libcallaudio0_1-0-0.1.99-2.1.aarch64.rpm"
RPM_HASH = "e00c4254360a1d57a1345e681765b5fa500e8c3ed9957ace77015c91110de09549aa80a9bb5018ad62af24cd4196cd7327af7f8a095c590367d7d30f637e2421"

RPROVIDES:${PN} += "libcallaudio-0.1.so.0 \
libcallaudio0-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
