SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libmodi-tools-20260902-1.1.aarch64.rpm"
RPM_HASH = "a7b59a01432902ef3871af371d5201d7e3bc486edade18e7f2af1dcd84969297daad7326b45664d549e0436f634f6d5e4e4b860217ade4d2593f755ac47337b2"

RPROVIDES:${PN} += "libmodi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse3.so.4 \
libmodi.so.1"

inherit rpm
