SUMMARY = "A Program That Lists Information about Files Opened by Processes"
DESCRIPTION = "Lsof lists information about files opened by processes. An open file \
may be a regular file, a directory, a block special file, a character \
special file, an executing text reference, a library, a stream, or a \
network file (Internet socket, NFS file, or UNIX domain socket.)  A \
specific  file or all the files in a file system may be selected by \
path."
LICENSE = "Zlib"

PV = "4.99.7"

RPM_NAME = "lsof-4.99.7-1.3.aarch64.rpm"
RPM_HASH = "94fabbc26de33afad8971189b7b46d790f4795f0d05d26ce3af1aeb0a6feb2608eba2b1f88414ea2d50c2f2d1a4d1c5c12019d584711f8e83d2c861b2147c73e"

RPROVIDES:${PN} += "lsof"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libtirpc.so.3"

inherit rpm
