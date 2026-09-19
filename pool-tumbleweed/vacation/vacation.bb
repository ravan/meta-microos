SUMMARY = "A way to automatically reply to incoming e-mail"
DESCRIPTION = "This program answers your e-mail when you are lying on the beach. \
 \
Documentation: man vacation"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7.1"

RPM_NAME = "vacation-1.2.7.1-15.10.aarch64.rpm"
RPM_HASH = "78edd5e06d8a16bf1f0d483372f57b9f588ea7321caf5c5b2a9175ee87cc870af6d7d21df3e08e1552aa5bbe087c588f4c9361dd0e86fa3bfd43048303f33195"

RPROVIDES:${PN} += "vacation"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
