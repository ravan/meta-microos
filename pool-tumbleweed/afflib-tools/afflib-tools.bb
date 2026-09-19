SUMMARY = "Tools for working with the Advanced Forensics Format"
DESCRIPTION = "The Advanced Forensics Format (AFF) is an openly specified, extensible file \
format for storing and analyzing hard disk images and other types of digital \
evidence. \
 \
This package contains the command line tools."
LICENSE = "BSD-4-Clause"

PV = "3.7.22"

RPM_NAME = "afflib-tools-3.7.22-1.4.aarch64.rpm"
RPM_HASH = "bde708a88c20b0478598fba268fd0383a521e784c27508cd186a8a33420086d3a9d53fea9eb952de3989c1ba8ba0fdd98e46c88a97d0a5a38792a19395e6c958"

RPROVIDES:${PN} += "afflib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libafflib.so.0 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libfuse3.so.4 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
