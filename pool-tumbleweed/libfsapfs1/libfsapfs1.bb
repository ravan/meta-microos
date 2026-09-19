SUMMARY = "Library for access to the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access to the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20240429"

RPM_NAME = "libfsapfs1-20240429-2.21.aarch64.rpm"
RPM_HASH = "f371fe40655e9324439a309d0ca97e23e325d569a2679e7103a2cb083e412b4b64b78e35610fb60323d2157f5d8e1c636d913abdaa22f9d660429c772e256cfe"

RPROVIDES:${PN} += "libfsapfs.so.1 \
libfsapfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmos.so.1 \
libhmac.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
