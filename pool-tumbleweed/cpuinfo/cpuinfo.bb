SUMMARY = "Tools for obtaining CPU information"
DESCRIPTION = "cpuinfo is a library to detect essential for performance optimization \
information about host CPU."
LICENSE = "BSD-2-Clause"

PV = "0~git1739936485.b73ae6c"

RPM_NAME = "cpuinfo-0~git1739936485.b73ae6c-2.5.aarch64.rpm"
RPM_HASH = "d49c5eb9aa7deb03ff440b071ce56a220ab18d73d77d01eb741717cd09f0763ec4bd41c32deb17dc9a3cb1078e21a17e1b690b9209f17f7c56674da9b9401ada"

RPROVIDES:${PN} += "cpuinfo"

RDEPENDS:${PN} += "libc.so.6 \
libcpuinfo-suse.so.0"

inherit rpm
