SUMMARY = "Tool to identify or delete duplicate files"
DESCRIPTION = "FDUPES is a program for identifying or deleting duplicate files \
residing within specified directories."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "fdupes-2.4.0-1.5.aarch64.rpm"
RPM_HASH = "dbe1220cb1c211514f2dc6372cb304cad41d1034defc89937b85a5fe2ea2e1eb912b50826a2ce1e4a4d51ffe00a87fb7c12690119a942be36250a6099b61e42d"

RPROVIDES:${PN} += "fdupes \
rpm-macro-fdupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
