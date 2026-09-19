SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format, which is used on Motorola-based Macintosh computers. \
On Intel-based Macintosh computers the GUID Partition Table (GPT) is \
used. The APM is supported by: Apple Unix (A/UX), Mac OS, Mac OS X. \
The APM consists of the drive descriptor, partition map entry of type \
Apple_partition_map, and zero partition map entries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260713"

RPM_NAME = "python313-libvsapm-20260713-1.2.aarch64.rpm"
RPM_HASH = "cd10daf6fb18690937de388c44743ab6df1889ba84a9d524149b6fc44d50c62fd8e69d023bb111ae72a567d6093200dff34445db4be786db2bb0c467d3fa43ac"

RPROVIDES:${PN} += "python3-libvsapm \
python313-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
