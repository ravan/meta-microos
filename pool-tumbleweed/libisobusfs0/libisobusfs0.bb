SUMMARY = "Component library for can-utils"
DESCRIPTION = "Component library for the CAN utilities."
LICENSE = "LGPL-2.0-only"

PV = "2025.01"

RPM_NAME = "libisobusfs0-2025.01-1.7.aarch64.rpm"
RPM_HASH = "0db99beec0ba63961433cc6de5dbfd90785ea773a6a6350716f6c5c426674351ead84b8dd0e2500a032276b5648c8b653f2d5b9f4289ca540105b8c444fe6e16"

RPROVIDES:${PN} += "libisobusfs.so.0 \
libisobusfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
