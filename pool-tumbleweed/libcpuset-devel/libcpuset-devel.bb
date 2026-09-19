SUMMARY = "cpuset processor and memory placement library"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
enables a system administrator to confine tasks to running certain \
CPUs, and to allocating memory on certain Memory Nodes.  The libcpuset \
library provides a convenient 'C' API to cpusets."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "libcpuset-devel-1.0-37.9.aarch64.rpm"
RPM_HASH = "2173ab89f2dac57ad254a3bc7b759f3db7d60fe2f255b8452fbc1be78838236dd534bbfc7730eab00ca96c2de49d77d09db7b4b2ddf1e7162f36269418cc669a"

RPROVIDES:${PN} += "libcpuset-devel"

RDEPENDS:${PN} += "glibc-devel \
libcpuset1"

inherit rpm
