SUMMARY = "Parallel Tasking Library"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the shared library for PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libptl2-2.3.3-1.26.aarch64.rpm"
RPM_HASH = "972207e145f6e26479cb3b4399c2d663dfddbf7e9a2e77f7b2da64b56ceba0ea1a10a5b792ea9ff455ff8494dcc30dbbc1c7d416072d42cd325a7c9fbe07768a"

RPROVIDES:${PN} += "libptl.so.2 \
libptl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
