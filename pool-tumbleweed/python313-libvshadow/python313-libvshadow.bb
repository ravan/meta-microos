SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "python313-libvshadow-20260714-1.2.aarch64.rpm"
RPM_HASH = "c61f9b762ddeb16d8b92433f9f57b81846215e1d58fa8a9d4504a7a1396ee0430877ea2327aa42c2362bc603119342d377f6f953a1a59847905f24fe50911f65"

RPROVIDES:${PN} += "python3-libvshadow \
python313-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
