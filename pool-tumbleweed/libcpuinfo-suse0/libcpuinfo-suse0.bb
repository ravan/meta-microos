SUMMARY = "CPU information library"
DESCRIPTION = "cpuinfo is a library to detect essential for performance optimization \
information about host CPU. \
 \
It offers detection of SoC and information about cores, cache, \
toplogy and supported instruction sets."
LICENSE = "BSD-2-Clause"

PV = "0~git1739936485.b73ae6c"

RPM_NAME = "libcpuinfo-suse0-0~git1739936485.b73ae6c-2.5.aarch64.rpm"
RPM_HASH = "3a2dcb03a3ad2986df32c2aab7b5246637e331b940cccdc9fcad2036f432eb859fde924afcea6cbde8773342652a10ca5a05fd521b74972e157b28f76769d5b7"

RPROVIDES:${PN} += "libcpuinfo-suse.so.0 \
libcpuinfo-suse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
