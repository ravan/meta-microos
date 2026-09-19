SUMMARY = "A minimal ACMEv2 client"
DESCRIPTION = "uacme is a client for the ACMEv2 protocol described in RFC8555, \
written in plain C code with minimal dependencies. \
The ACMEv2 protocol allows a Certificate Authority and an \
applicant to automate the process of verification and certificate \
issuance. The protocol also provides facilities for other \
certificate management functions, such as certificate revocation."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "uacme-1.8.1-1.3.aarch64.rpm"
RPM_HASH = "21b1f4b79786af2a6704d4446b526fc6c81bb6fed3715e1733505c3bbc79f98de9a01d7a807f0b7d9bd28a6d854c50379c19f05908078b2bc8c9a8b45131b68d"

RPROVIDES:${PN} += "uacme"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30"

inherit rpm
