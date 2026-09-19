SUMMARY = "System capture library of the falcosecurity libs"
DESCRIPTION = "libscap reads system events from the falcosecurity drivers and from \
scap capture files."
LICENSE = "Apache-2.0"

PV = "0.25.4"

RPM_NAME = "libscap0-0.25.4-2.3.aarch64.rpm"
RPM_HASH = "cbda2b35d2f5b4bdfdbe80aab74170c860cde1776efab07803337720252943ee6db809f1d11b2eaf5ecf0e63f4eb333ed2b3b9800a217421ec3bc6eb94095f1d"

RPROVIDES:${PN} += "libpman.so \
libscap-engine-kmod.so.0 \
libscap-engine-modern-bpf.so.0 \
libscap-engine-nodriver.so.0 \
libscap-engine-source-plugin.so.0 \
libscap-engine-test-input.so.0 \
libscap-event-schema.so \
libscap-platform.so \
libscap.so.0 \
libscap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
