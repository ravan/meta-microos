SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsapm to \
inspect Apple Partition Map partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20260713"

RPM_NAME = "libvsapm-tools-20260713-1.2.aarch64.rpm"
RPM_HASH = "fca3fcb4bd7a506f307ec8137ab1f1be646e94a17ca7b5671658d52fcd4c743e7349c2e61f2b3c19a6fa374007826447660172f7388109b2b098f49e530c08c1"

RPROVIDES:${PN} += "libvsapm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsapm.so.1"

inherit rpm
