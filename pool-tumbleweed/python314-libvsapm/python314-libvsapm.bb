SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format, which is used on Motorola-based Macintosh computers. \
On Intel-based Macintosh computers the GUID Partition Table (GPT) is \
used. The APM is supported by: Apple Unix (A/UX), Mac OS, Mac OS X. \
The APM consists of the drive descriptor, partition map entry of type \
Apple_partition_map, and zero partition map entries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260713"

RPM_NAME = "python314-libvsapm-20260713-1.2.aarch64.rpm"
RPM_HASH = "0227d31071251021ed5a479f12545e60271a6ba4e80c3a6aca6da0b60781a8af395eb3e8640390ed4192762ec9046e4b0e2b50210341c3677eef059905bda369"

RPROVIDES:${PN} += "python314-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
