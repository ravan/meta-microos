SUMMARY = "Distributed software configuration management"
DESCRIPTION = "Fossil is a distributed software configuration management system with \
these features: \
* integrated bug tracking and wiki \
* built-in web-interface \
* uses HTTP, with proxy support \
* everything is in a single executable and CGI-enabled \
* sqlite-backed database"
LICENSE = "BSD-2-Clause"

PV = "2.28"

RPM_NAME = "fossil-2.28-1.4.aarch64.rpm"
RPM_HASH = "0222889c81968dbdfe951a59b93547046b674efdc0ba0e363802ade020ed65362c14c8a3d1c5e1eeab9840dc71f8dea166b83976ac50d215f0038960c648f1bd"

RPROVIDES:${PN} += "fossil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libresolv.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
libz.so.1"

inherit rpm
