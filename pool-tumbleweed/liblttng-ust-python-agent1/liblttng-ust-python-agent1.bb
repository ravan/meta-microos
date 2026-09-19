SUMMARY = "Linux Trace Toolkit Userspace Tracer Python agent library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "liblttng-ust-python-agent1-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "a776fd89fa83288988bbe7fcfd1ab881ae30eefe1a4b7401f74ae6f2f418b4c12b207f15b3ad381a3402f18e60398763cdf92729549832e71e9f9c84b323efdd"

RPROVIDES:${PN} += "liblttng-ust-python-agent.so.1 \
liblttng-ust-python-agent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblttng-ust.so.1"

inherit rpm
