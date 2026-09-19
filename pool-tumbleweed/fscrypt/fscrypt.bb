SUMMARY = "Go tool for managing Linux filesystem encryption"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories."
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "fscrypt-0.3.7-1.1.aarch64.rpm"
RPM_HASH = "0f4c64b685f2153c2a8411db1e110c810694ffe1a488e05e87aaaec187ea3c8fc80b3263ef2abcd6e5de37b2d14de5f0a996a3ecaa6ee997dd08d9a1178cf871"

RPROVIDES:${PN} += "fscrypt"

RDEPENDS:${PN} += "libc.so.6 \
libpam.so.0 \
pam-fscrypt"

inherit rpm
