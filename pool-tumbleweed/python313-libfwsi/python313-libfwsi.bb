SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "python313-libfwsi-20260522-1.9.aarch64.rpm"
RPM_HASH = "9f74cb61368b8ef995f67288c78e2e001826eaf39bc8ec4baa7d38d4b1ba0bdd3068fbd61a4fdcd8006f1bd485e6040c2e8a9e78c4d2fb43037e1dfbc020c653"

RPROVIDES:${PN} += "python3-libfwsi \
python313-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
