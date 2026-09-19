SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260827"

RPM_NAME = "python314-libfsntfs-20260827-1.1.aarch64.rpm"
RPM_HASH = "9d67970081edf176f15cceab8b0d03fdcaa4471cd92bcca7604b1fde6f272704cbdebe588d4da36c982bc52626a8876895bdcc285ac8484705da6ceb635cd235"

RPROVIDES:${PN} += "python314-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
