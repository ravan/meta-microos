SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "python314-libfwsi-20260522-1.9.aarch64.rpm"
RPM_HASH = "84ea1526743abdc138e9b9f71524231d1f3bb953d38b5ab433dcc4e786cb2fb0c06c5901eeb25c5cc907c622636fef457c4540e3eb7ba84da4afbf3eb5133d35"

RPROVIDES:${PN} += "python314-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
