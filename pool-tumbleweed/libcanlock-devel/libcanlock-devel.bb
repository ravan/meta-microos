SUMMARY = "Development files for Usenet cancel lock library"
DESCRIPTION = "libcanlock is a library for creating and verifying RFC 8315 Netnews \
Cancel-Locks. This implementation uses the recommended algorithm from \
Section 4 with HMAC based on the same hash function as <scheme>. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcanlock."
LICENSE = "MIT & NLPL"

PV = "3.3.3"

RPM_NAME = "libcanlock-devel-3.3.3-1.2.aarch64.rpm"
RPM_HASH = "aed2c5f11bfd1d87eab43a7f757b2fea2a5d47de4885b68aff4ff635fa2d5e58631c3d01692de1290235e769380d9032eaa1a62a76ae7580adeebaffb48ffcd5"

RPROVIDES:${PN} += "libcanlock-devel \
pkgconfig-libcanlock-3 \
pkgconfig-libcanlock-hp-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanlock3"

inherit rpm
