SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "libbtrfsutil-devel-7.1-1.2.aarch64.rpm"
RPM_HASH = "36cd71843887a222f6f8d19ffb4f59b6df4321e1dba8081c164e7e2e3fab3278346e9aadac9530152c61fe85b951501e6eaabfae584a884c38b45c448efaead5"

RPROVIDES:${PN} += "libbtrfsutil-devel \
pkgconfig-libbtrfsutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
btrfsprogs \
libbtrfsutil1"

inherit rpm
