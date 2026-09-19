SUMMARY = "YAML parser and emitter in C++"
DESCRIPTION = "A YAML parser and emitter in C++ matching the YAML 1.2 spec."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libyaml-cpp0_9-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "3f581c31348bc674d3d64683dd3b55c502bcfa8e1ee695d214c98253f67c97bec4c3f6b961fe3efa2bb3e6360ababcae646ef4908342b2093c35947198df9aa0"

RPROVIDES:${PN} += "libyaml-cpp.so.0.9 \
libyaml-cpp0-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
