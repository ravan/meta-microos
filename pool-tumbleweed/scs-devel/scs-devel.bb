SUMMARY = "Development files for scs"
DESCRIPTION = "SCS (splitting conic solver) is a numerical optimization package for \
solving large-scale convex cone problems. \
This package provides development libraries and headers for scs."
LICENSE = "MIT"

PV = "3.2.6"

RPM_NAME = "scs-devel-3.2.6-1.8.aarch64.rpm"
RPM_HASH = "302f0769f27cf7087bf7c73aa5e2e07f9923a7833b3ed03ae09151b21f72f810909e400a9bd1582962cf59c8eb7bd374bf3d50761ada86929d0fc6d22e375fe8"

RPROVIDES:${PN} += "libscsdir.so \
libscsindir.so \
scs-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
