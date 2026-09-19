SUMMARY = "Headers for building with PTL"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the headers and sources for developing against PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "ptl-devel-2.3.3-1.26.aarch64.rpm"
RPM_HASH = "f882b11ace3ddecb5c1bafb995359c6b167d63dc327bb5ff7ecbcb9fb8b63aef98a9943da7cf6e8493c199b05a8bcc348c146dbaebd5cc99fbdf8ce6c27e8cb4"

RPROVIDES:${PN} += "cmake-PTL \
pkgconfig-ptl \
ptl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptl2 \
pkgconfig-tbb \
tbb-devel"

inherit rpm
