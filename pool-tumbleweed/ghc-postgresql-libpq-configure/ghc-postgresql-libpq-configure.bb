SUMMARY = "Low-level binding to libpq: configure based provider"
DESCRIPTION = "This is a binding to libpq: the C application programmer's interface to \
PostgreSQL. libpq is a set of library functions that allow client programs to \
pass queries to the PostgreSQL backend server and to receive the results of \
these queries."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-postgresql-libpq-configure-0.11-2.6.aarch64.rpm"
RPM_HASH = "5c88b6ec6a55d817485b1acc9e2f425e962f8351ba92f857e8384530daf41365e31a989c27e7fbffceefbc58ee9da6fdef004cfbcb5a7f7bcddf41997b98c187"

RPROVIDES:${PN} += "ghc-postgresql-libpq-configure"

RDEPENDS:${PN} += ""

inherit rpm
