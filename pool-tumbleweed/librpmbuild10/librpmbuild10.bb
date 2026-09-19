SUMMARY = "Library for building RPM packages"
DESCRIPTION = "Thie package contains a library with functions for building RPM packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "librpmbuild10-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "3e44ad7e1400e5e89d35ef1dc55d364d34ae30ef559eb08724f8f121d8d891f0fd5f9471de7858cfadd20a78075623ed9564a390f1a773c693cdc2e3d975a432"

RPROVIDES:${PN} += "librpmbuild.so.10 \
librpmbuild10"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
liblua5.4.so.5 \
libmagic.so.1 \
libpopt.so.0 \
librpm.so.10 \
librpmio.so.10"

inherit rpm
