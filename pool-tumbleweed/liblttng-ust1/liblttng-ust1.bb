SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "liblttng-ust1-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "0e37662bf86e73ae7559fc6d29206654b63e4dc520d2aba8036d41b1360d88cb6a521d4a049f9650350d86ab6dfdde50263c0aff62c4d00a59a4716bed010abe"

RPROVIDES:${PN} += "liblttng-ust-common.so.1 \
liblttng-ust-cyg-profile-fast.so.1 \
liblttng-ust-cyg-profile.so.1 \
liblttng-ust-dl.so.1 \
liblttng-ust-fd.so.1 \
liblttng-ust-fork.so.1 \
liblttng-ust-libc-wrapper.so.1 \
liblttng-ust-pthread-wrapper.so.1 \
liblttng-ust-tracepoint.so.1 \
liblttng-ust.so.1 \
liblttng-ust1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
