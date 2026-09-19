SUMMARY = "A library used to distribute workloads"
DESCRIPTION = "A simple interface for processing workloads using an automatically distributed global queue."
LICENSE = "BSD-3-Clause-LBNL"

PV = "0.3"

RPM_NAME = "libcircle2-0.3-2.3.aarch64.rpm"
RPM_HASH = "dac2593bc7e329217ce508090da6784d5831f3495a11ef1b89b5e8e389fbd855f17176093ea072f8bd808393cd3dbfc1a68a956b97d07525a3edeef18b936081"

RPROVIDES:${PN} += "libcircle.so.2 \
libcircle2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
openmpi5-libs"

inherit rpm
