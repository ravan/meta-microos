SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "librdmacm-utils-63.0-1.3.aarch64.rpm"
RPM_HASH = "62176e9ff893c7a7dbe0c2e853302c710ac7781ffd91b68bb8399a871df65603114424e9eb44524a43054855229f4dc704315274d06793d43a884f918360b01b"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
