SUMMARY = "Library for working with the Advanced Forensics Format-Runtime support"
DESCRIPTION = "The Advanced Forensics Format (AFF) is an openly specified, extensible file \
format for storing and analyzing hard disk images and other types of digital \
evidence. \
 \
This package contains the shared libraries necessary for software that needs to \
work with the AFF library."
LICENSE = "BSD-4-Clause"

PV = "3.7.22"

RPM_NAME = "libafflib0-3.7.22-1.4.aarch64.rpm"
RPM_HASH = "1b346274d47a31a474b98bb300e1b38a350535bc824c02f4ae7235886ccc04c50bd7347f4d27f689655c149d09d78c6fb654b47394edae0fed253f3e9793dda5"

RPROVIDES:${PN} += "libafflib.so.0 \
libafflib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
