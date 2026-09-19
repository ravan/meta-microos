SUMMARY = "System inspection library of the falcosecurity libs"
DESCRIPTION = "libsinsp adds the state engine, filtering, formatting and plugin \
framework on top of libscap."
LICENSE = "Apache-2.0"

PV = "0.25.4"

RPM_NAME = "libsinsp0-0.25.4-2.3.aarch64.rpm"
RPM_HASH = "b5cd309b3e388ef8d8d442c3cdb9658059b73411c6738fef26eed9a09099993054f60835327204faf060e21a19b6332fb2b2e5db4734bd0563f49ba9a08dbdcc"

RPROVIDES:${PN} += "libsinsp.so.0 \
libsinsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libre2.so.11 \
libscap-engine-kmod.so.0 \
libscap-engine-modern-bpf.so.0 \
libscap-engine-nodriver.so.0 \
libscap-engine-source-plugin.so.0 \
libscap-engine-test-input.so.0 \
libscap-event-schema.so \
libscap-platform.so \
libscap.so.0 \
libscap0 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
