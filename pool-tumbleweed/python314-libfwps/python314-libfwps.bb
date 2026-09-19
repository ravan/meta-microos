SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "python314-libfwps-20260522-1.9.aarch64.rpm"
RPM_HASH = "0b787b40381a99c9b06fdde3a75467d130c047b90b912105cad8a48e2670f9587149625b8207c596f5ef9eb1a7726c090b035e22c7c12b924b618d7b5feb348c"

RPROVIDES:${PN} += "python314-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
