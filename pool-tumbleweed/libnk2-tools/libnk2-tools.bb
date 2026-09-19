SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnk2 to \
read Outlook Nickfile files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnk2-tools-20260526-1.12.aarch64.rpm"
RPM_HASH = "d3fae8e9175172434492ec10750225395a79f1d99db6e928552328c31238068a04ab95d2c13412f660115ca37496705800124e9c9025be43d8afd612f8871926"

RPROVIDES:${PN} += "libnk2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfvalue.so.1 \
libnk2.so.1"

inherit rpm
