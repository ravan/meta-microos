SUMMARY = "Development files for the rz-ghidra package"
DESCRIPTION = "Development files for the rz-ghidra package. See rz-ghidra package for more \
information."
LICENSE = "LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "rz-ghidra-devel-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "d5c0255a8dfd9d633dffa0a9d4f5b7af10efd5bdc81fb9d882912584f1f4c579233b5ecf79751f44e6b2893d16c51aac1829e27f34b748966f280b7651fd8e44"

RPROVIDES:${PN} += "pkgconfig-rz-ghidra \
rz-ghidra-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-rz-core \
rz-ghidra"

inherit rpm
