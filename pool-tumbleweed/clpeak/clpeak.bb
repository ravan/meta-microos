SUMMARY = "Find peak OpenCL capacities like bandwidth & compute"
DESCRIPTION = "A tool which profiles OpenCL devices to find their peak capacities like \
bandwidth & compute."
LICENSE = "Apache-2.0"

PV = "2.1.4"

RPM_NAME = "clpeak-2.1.4-1.1.aarch64.rpm"
RPM_HASH = "fb3fba7d10a967d100553be78adcf768e95993750fc02f9c4eb715f2cb9af492cedffb806d4c548dd0835922900a1e7c8f4bf1934050710f3bc9f018a414b520"

RPROVIDES:${PN} += "clpeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvulkan.so.1"

inherit rpm
