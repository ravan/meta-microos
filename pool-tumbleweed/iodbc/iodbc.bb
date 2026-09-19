SUMMARY = "ODBC compliant driver manager"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI and \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "iodbc-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "0ff1ae88f80666c8eff0639076a203512522dc8be0df3f9759ba36778380151b189a9ea9c8cf7d9aa7b1fbbdc2e8154eff53d9f01c44fcdbea7cf983a6a533af"

RPROVIDES:${PN} += "iodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2"

inherit rpm
