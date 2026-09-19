SUMMARY = "Utilities for inspecting MS-DOS partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsmbr to \
inspect MS-DOS partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libvsmbr-tools-20240505-1.20.aarch64.rpm"
RPM_HASH = "15c5afee0e8393575e6874f4a373609390bd0ae9b1844ae4f9bff5acaed173c39fb9be4fb2e68fe39d6531e15ec6824e30798bd62f1d1426e85ad3302a11bcb9"

RPROVIDES:${PN} += "libvsmbr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsmbr.so.1"

inherit rpm
