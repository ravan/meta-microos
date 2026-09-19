SUMMARY = "Kea database abstraction library"
DESCRIPTION = "Kea's database abstraction library."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-database88-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "0fc0c73f3116760ab086d9c53e0159de51f429639181fa1be7bb0035baa6bbf4ad241831d36ba2e7408acb065e30bb236d6673a48d589072a5080b8491e29f51"

RPROVIDES:${PN} += "libkea-database.so.88 \
libkea-database88"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.98 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
