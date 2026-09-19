SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260827"

RPM_NAME = "python313-libfsntfs-20260827-1.1.aarch64.rpm"
RPM_HASH = "153bac6ae7a5b9b2143bc1e80e0cc2bab26148685d6ada9fbab23cc1d72a06dd7a54a0064d3dce8cc31644ec2f2ad698c6f14cb03b849c7724be61a40b5bf2ae"

RPROVIDES:${PN} += "python3-libfsntfs \
python313-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
