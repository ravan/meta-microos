SUMMARY = "A port of Macro SNOBOL4"
DESCRIPTION = "This is a free port of the original SIL (SNOBOL4 Implementation \
Language) 'macro' version of SNOBOL4 (developed at Bell Labs) with the \
`C' language as a target. \
 \
SNOBOL4, while known primarily as a string language excels at any task \
involving symbolic manipulations.  It provides dynamic typing, garbage \
collection, user data types, on the fly compilation."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "41716efd5e95fd80d1c9fba102c3d9fea18ab0dae734e2686d6c295407a2d537f057d9a51282974b19bbb4d024c409b4d1b2e74822af60cfca7bf9f48c28bb39"

RPROVIDES:${PN} += "snobol4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgdbm-compat.so.4 \
liblzma.so.5 \
libm.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
libssl.so.3 \
libtcl8.6.so \
libz.so.1"

inherit rpm
