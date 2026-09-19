SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libwrc-tools-20260705-1.2.aarch64.rpm"
RPM_HASH = "ce10085290c3d785d70c1f64956810f40874ac8bf98a7811bb5fb2a88c399674e3f58e34baa030d9b6b3353e4587e0f11f9c5f7b795b03491926bb02d4baca61"

RPROVIDES:${PN} += "libwrc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1 \
libfwnt.so.1 \
libwrc.so.1"

inherit rpm
