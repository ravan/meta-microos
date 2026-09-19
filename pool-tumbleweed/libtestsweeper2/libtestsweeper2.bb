SUMMARY = "Shared library for testsweeper, a C++ testing framework for parameter sweeps"
DESCRIPTION = "TestSweeper is a C++ testing framework for parameter sweeps. It handles parsing \
command line options, iterating over the test space, and printing results. This \
simplifies test functions by allowing them to concentrate on setting up and \
solving one problem at a time. \
 \
This package provides the share library for testsweeper."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "libtestsweeper2-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "c4962c595faeedb8a65f8dcf1cb3899337b03d71619005e59259a6ef84b8fbfe405574d1ac198e880e63dcee7110cab0a6a154d7431313bfb3d4e5d6d27a8657"

RPROVIDES:${PN} += "libtestsweeper.so.2 \
libtestsweeper2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6"

inherit rpm
