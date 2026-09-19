SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "liblttng-ust-ctl6-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "425df103709fa646cecdd8b84fe9565713ece8528cf80d626f764c7ae5d073fadf9d3fc7895d541a07cfff87f94ba715e2263a6820fc7aca6a5b54e99813024d"

RPROVIDES:${PN} += "liblttng-ust-ctl.so.6 \
liblttng-ust-ctl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblttng-ust-common.so.1 \
libnuma.so.1"

inherit rpm
