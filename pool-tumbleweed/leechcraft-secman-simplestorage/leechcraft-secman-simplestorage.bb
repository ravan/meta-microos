SUMMARY = "LeechCraft Simple storage Module"
DESCRIPTION = "This package provides a simple unencrypted storage backend for LeechCraft SecMan."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-secman-simplestorage-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "01eac1ebb3fd8ba685410fc057745742f0f6e0e935641481e0db6dc5862ee953a524f2b62cac1e2f799c0fa2ceb1ce84b50972f55d0c3c6449c6061444df0053"

RPROVIDES:${PN} += "leechcraft-secman-simplestorage \
libleechcraft-secman-simplestorage.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-secman \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
