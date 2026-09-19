SUMMARY = "Library for irman access"
DESCRIPTION = "libirman is a general purpose library for programs to use in order to \
receive infrared signals via irman-compatible hardware."
LICENSE = "LGPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "libirman0-0.5.2-6.3.aarch64.rpm"
RPM_HASH = "9aace675b87307f4d8a9be9aa4dc348f0c358cee9c87acaf8eaba3b12ee0e2ed2458a9cf4f78dc326e1583723d763425bab5e845e075e54349b9eaec3fc06845"

RPROVIDES:${PN} += "libirman.so.0 \
libirman0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libirman-common"

inherit rpm
