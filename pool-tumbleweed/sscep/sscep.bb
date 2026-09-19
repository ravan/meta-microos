SUMMARY = "A command line client for the SCEP protocol"
DESCRIPTION = "Simple SCEP (Simple Certificate Enrollment Protocol) client with \
modifications for engine support & more."
LICENSE = "BSD-3-Clause-Attribution & OpenSSL"

PV = "0.10.0"

RPM_NAME = "sscep-0.10.0-3.5.aarch64.rpm"
RPM_HASH = "47135339e00a0111709bdb7951fe17368ff0afb60b83783e490774aaf5b99cd21012a66d3992b54532678736c628b26e8848a7da2c3e12c545525bbdac124dad"

RPROVIDES:${PN} += "config-sscep \
sscep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
