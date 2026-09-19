SUMMARY = "CPU and Heap profiling library"
DESCRIPTION = "This subpackage contains a library with cpu and heap profiling."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libprofiler0-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "3ecf7adc039a1767285094ddfeeddc5f657c282b1fbd371dfafd8617bcdcc78a7964c3f6a2e772ce692b64ca49cfa7246622f89f8661399f94b6dea2db70040f"

RPROVIDES:${PN} += "libprofiler.so.0 \
libprofiler0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
