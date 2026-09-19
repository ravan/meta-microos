SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "python314-libscca-20260527-1.11.aarch64.rpm"
RPM_HASH = "c4c23d93cbf436752b5d261ed954c1d730f0ccdf3a2ad48ba0ebf5218e285ee5ef34a1ff9decd09abba9dfb4d0c96c1faf398f9c3612948ebc50195d171c1d2e"

RPROVIDES:${PN} += "python314-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
