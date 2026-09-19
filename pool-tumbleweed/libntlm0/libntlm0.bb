SUMMARY = "Implementation of Microsoft's NTLMv1 authentication"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libntlm0-1.8-2.3.aarch64.rpm"
RPM_HASH = "5c33aaf36dc285f797e57f7621eef16b7c29a9148fe402314a098f44324d0ed3505edcc041e566d5b53c708100cd6434c272d673dbe75f3a362b572b77e9963c"

RPROVIDES:${PN} += "libntlm.so.0 \
libntlm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
