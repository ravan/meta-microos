SUMMARY = "Utilities for exFAT file system"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "exfat-utils-1.4.0-2.10.aarch64.rpm"
RPM_HASH = "cf60b4ec53b248b2dd717d29d1283abac467603526101802b4e634c1f0450e7cc68e729532b6961c55b69288e3105bb1f659332fad261d74e58fb07d2925bcc7"

RPROVIDES:${PN} += "exfat-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
