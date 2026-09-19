SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260911"

RPM_NAME = "python313-libvsgpt-20260911-1.1.aarch64.rpm"
RPM_HASH = "720898f9dfe97c875630c76c15fcbe744d880411720efc2de1fc3d87cbd1c16505a7c52b8c643a9f0de5b43e2908809a22e8c24f108ef3d253c3243f37b0cb9f"

RPROVIDES:${PN} += "python3-libvsgpt \
python313-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm
