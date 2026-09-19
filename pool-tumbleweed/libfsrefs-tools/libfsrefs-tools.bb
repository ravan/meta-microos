SUMMARY = "Utilities to inspect Resilient File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsrefs, which allows for \
reading Resilient File System (ReFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-tools-20210422-3.31.aarch64.rpm"
RPM_HASH = "8ff9c2118844a51c61f030823f7bd0fc54c2837ecb1aa3351bf4477d44f100cd8b9e4375bc9d2d571f5e521d1f4dc0577d4ed2e1f1c99bbb5c49218448ce398d"

RPROVIDES:${PN} += "libfsrefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsrefs.so.1"

inherit rpm
