SUMMARY = "Headers for libmnl, a Netlink communications library"
DESCRIPTION = "libmnl is a user-space library for parsing, validation, constructing \
Netlink headers and TLVs. This subpackage has the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libmnl-devel-1.0.5-2.8.aarch64.rpm"
RPM_HASH = "bb0b92ca3ef8719a1d763fdb9b6ec0c9443f9194a8ad1dda3da135cb74a2a6e6cd9e6d39d56e67fcdc6a48f4ddf88b4cd89956da7e19c2aa3bd7b1e66b4b4109"

RPROVIDES:${PN} += "libmnl-devel \
pkgconfig-libmnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmnl0"

inherit rpm
