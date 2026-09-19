SUMMARY = "Go tool for managing Linux filesystem encryption (the pam module)"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories. \
 \
This package holds the pam module for fscrypt."
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "pam-fscrypt-0.3.7-1.1.aarch64.rpm"
RPM_HASH = "62509d845948879a81a67c78b7ac9e7e5835a8493febc190b61529ef3b34674709b8ee8a1c21b85a58e7b28ca3d999731051c174cc108eebec1da40e37e6b29a"

RPROVIDES:${PN} += "pam-fscrypt"

RDEPENDS:${PN} += "fscrypt \
libc.so.6 \
libpam.so.0"

inherit rpm
