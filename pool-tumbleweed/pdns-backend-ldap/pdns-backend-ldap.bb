SUMMARY = "LDAP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LDAP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-ldap-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "e2be10815e1919b61b12812ed2ed334ce8c5bfe39ad3c9716ab8a63c8d20eea97630065efc64ca7e1a774a7ca0861241a6ef82d5dced75397312bb1ded3efb68"

RPROVIDES:${PN} += "libldapbackend.so \
pdns-backend-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libstdc++.so.6 \
pdns"

inherit rpm
