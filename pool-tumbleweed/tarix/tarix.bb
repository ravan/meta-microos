SUMMARY = "Simple Indexer for GNU and POSIX Tar Files"
DESCRIPTION = "tarix is a simple indexer for GNU and POSIX tar files. The indexes allow fast \
extraction of files in the archive, especially on seekable tape devices. The \
index format is simple enough to be used from a rescue disk with only mt, \
dd, and tar (though grep and sed would be very useful there)."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "tarix-1.0.9-2.3.aarch64.rpm"
RPM_HASH = "6b0f0b72d4e2bb788a5aca8bc87421216c3598c7ed1c27e547777f3d587b3056b7c84c7566ed1ed1d6963132814dcffe8beeb64ae6e4f7ca1c2286cef010157a"

RPROVIDES:${PN} += "tarix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libglib-2.0.so.0 \
libz.so.1"

inherit rpm
