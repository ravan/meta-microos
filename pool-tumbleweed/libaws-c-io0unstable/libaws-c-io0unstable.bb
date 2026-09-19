SUMMARY = "Shared library files for aws-c-io library"
DESCRIPTION = "This is a module for the AWS SDK for C. It handles all I/O \
and TLS work for application protocols. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.27.7"

RPM_NAME = "libaws-c-io0unstable-0.27.7-1.1.aarch64.rpm"
RPM_HASH = "fdae4fbfda51ea0303ff02ba58b761e60b7277c066faedece7a060d15920c74d6a120ac995d586613a9a434a0bbbda723bc4acfd0a79f45f8bbf9dc31ae8ca02"

RPROVIDES:${PN} += "libaws-c-io.so.0unstable \
libaws-c-io0unstable"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libc.so.6 \
libs2n.so.1"

inherit rpm
