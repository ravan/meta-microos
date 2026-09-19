SUMMARY = "Backend library for pkgconf"
DESCRIPTION = "This package provides libraries for applications to use the functionality \
of pkgconf."
LICENSE = "ISC"

PV = "2.5.1"

RPM_NAME = "libpkgconf7-2.5.1-1.5.aarch64.rpm"
RPM_HASH = "bf797c0da313192fcc57f5279f6d39f69141bd0594847737420d7917b2248653ac6e45aa8b58c9b4275f47a52d62dc90213525451f4c0dc494659846d29cc82c"

RPROVIDES:${PN} += "libpkgconf.so.7 \
libpkgconf7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
