SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libnettle-devel-3.10.2-1.6.aarch64.rpm"
RPM_HASH = "4558c64f309a0e67af1c1b10d6820d9e1731b7e7e7ff1755fb40da4683da1655145757b5eea34cac29a1fd76a26c1102f218a7a7b74d5d6a4c6027d32c86b3c3"

RPROVIDES:${PN} += "libnettle-devel \
pkgconfig-hogweed \
pkgconfig-nettle"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
gmp-devel \
libhogweed6 \
libnettle8 \
pkgconfig-nettle"

inherit rpm
