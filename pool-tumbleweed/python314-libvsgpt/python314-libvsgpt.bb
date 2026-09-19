SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260911"

RPM_NAME = "python314-libvsgpt-20260911-1.1.aarch64.rpm"
RPM_HASH = "fa9f14e655b1d8af614769697d3ca063843341d488841d5d802aec20a609f37b008db112a0fd2f7ede9f44c0cfe2259d93137490936f1c43c8e55646170872d8"

RPROVIDES:${PN} += "python314-libvsgpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvsgpt.so.1 \
python-abi"

inherit rpm
