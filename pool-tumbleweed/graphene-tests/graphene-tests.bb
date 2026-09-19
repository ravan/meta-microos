SUMMARY = "Installed tests for graphene"
DESCRIPTION = "This package provides installed tests for graphene, \
compatible with gnome-desktop-testing-runner."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "graphene-tests-1.10.8-3.1.aarch64.rpm"
RPM_HASH = "70d5b1b402c04a80539b889547c1e44127f78528891a0185b2f10d2fa78ef8cb4bd9e7b59adc9455b5bdd621646565f84fbd9ff94906d7fae09fb495645dfa03"

RPROVIDES:${PN} += "graphene-tests"

RDEPENDS:${PN} += "/usr/bin/env \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgraphene-1-0-0 \
libgraphene-1.0.so.0 \
typelib-Graphene"

inherit rpm
