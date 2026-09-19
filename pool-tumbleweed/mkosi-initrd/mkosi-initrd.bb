SUMMARY = "Build initrds locally using mkosi"
DESCRIPTION = "This package provides the mkosi-initrd wrapper to build initrds with mkosi \
locally."
LICENSE = "LGPL-2.1-or-later"

PV = "27"

RPM_NAME = "mkosi-initrd-27-3.1.aarch64.rpm"
RPM_HASH = "4f07c0dd7668357bf3e5f2b04b01aa0161676cef8a50e93b80ff6ee29129a2a6675ac6023a68790dc019b3bef4c6bdcc384a0c67d077b08d12b5768618bbda5e"

RPROVIDES:${PN} += "mkosi-initrd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
mkosi \
suse-module-tools-scriptlets"

inherit rpm
