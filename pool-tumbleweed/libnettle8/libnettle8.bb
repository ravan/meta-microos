SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libnettle8-3.10.2-1.6.aarch64.rpm"
RPM_HASH = "1f87051654a05bd4631ad0dbae433e8cc22f3f1f22d565ce7f2bb352f8051ecc9b56f1f4c66eccb525ed48cb54e25bdabd63c8f0152eae8afed1eb1ed610d0f7"

RPROVIDES:${PN} += "libnettle.so.8 \
libnettle8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
