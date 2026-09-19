SUMMARY = "Memory usage monitoring tool"
DESCRIPTION = "Smemstat reports the physical memory usage taking into consideration shared \
memory. The tool can either report a current snapshot of memory usage or \
periodically dump out any changes in memory."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "smemstat-0.02.13-1.11.aarch64.rpm"
RPM_HASH = "ea625c89f697532e37955280316661b79619c53a24cbb74bd032e9bd7558599dd82e6cdf5d6a4a7eb1ec9a9a1154e9bc9eec5be2040a22705af02bac67a15c82"

RPROVIDES:${PN} += "smemstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
