SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "python314-libvshadow-20260714-1.2.aarch64.rpm"
RPM_HASH = "4c140c45bc154e876cd2afb18cbd69ee927f5b79a0a9cc568bd69d04b15cfe1bb9a76690b05fc2bbbd9a0e57396b67262d4905ccadc1f3c4b915d2e298b2d18c"

RPROVIDES:${PN} += "python314-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
