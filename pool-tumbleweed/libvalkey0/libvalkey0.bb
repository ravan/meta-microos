SUMMARY = "Valkey client library in C"
DESCRIPTION = "Libvalkey is the official C client for the Valkey database. It also supports \
any server that uses the RESP protocol (version 2 or 3). This project supports \
both standalone and cluster modes. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "libvalkey0-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "4d84e16de3c483bc41fcdc9bf789af0e02bcb414be090372c458b45de10a6fe43b44babfe9130e7031d8ca251cebff2e039ca32e6a56f4d2932d53e67be87ef1"

RPROVIDES:${PN} += "libvalkey.so.0 \
libvalkey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
