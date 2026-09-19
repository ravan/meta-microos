SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "python313-libscca-20260527-1.11.aarch64.rpm"
RPM_HASH = "ad3ef59269ce1b2cdc8cbcd1090a821d857b315eaabf8d5d0b4241df1cdad8baa1f055f5efced743a9c37c0a060e2cbd3b328f0ab2a9fe889451b2a76555e240"

RPROVIDES:${PN} += "python3-libscca \
python313-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
