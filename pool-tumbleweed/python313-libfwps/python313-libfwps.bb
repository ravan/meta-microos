SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "python313-libfwps-20260522-1.9.aarch64.rpm"
RPM_HASH = "656bf2672eb392c586555771e2013101f0b658f24f330d2462c7cb391c73461a06fe82e38a40c5449385f596acb9164181038e4e11a921c38a3c91aa0220ff1f"

RPROVIDES:${PN} += "python3-libfwps \
python313-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
