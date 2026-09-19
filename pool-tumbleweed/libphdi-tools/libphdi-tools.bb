SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libphdi-tools-20260902-1.1.aarch64.rpm"
RPM_HASH = "9d84eb91a235c336b59f720574909cc19db74d4db5482e3137db113f6ffa2f9b70e08bbc241d666b394ce2d53205f71c53262270b227fd33b933843f71ae59e3"

RPROVIDES:${PN} += "libphdi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfuse3.so.4 \
libphdi.so.1"

inherit rpm
