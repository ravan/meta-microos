SUMMARY = "Memory (un)happing hooks for Unified Communication X"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucm0-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "a9bde16a72fa1287c20366fd60b8e024499da7921e1b094475b799b4a2e227ef84ec42526455d21a6a14e04edc7e4ea958f7dc7a12e093b6430858b9ec8ea838"

RPROVIDES:${PN} += "libucm.so.0 \
libucm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
