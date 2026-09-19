SUMMARY = "A small build system closest in spirit to Make"
DESCRIPTION = "Ninja is yet another build system. It takes as input the interdependencies \
of files (typically source code and output executables) and orchestrates \
building them, quickly."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "ninja-1.13.2-1.4.aarch64.rpm"
RPM_HASH = "93ac84148875fb9a0dc3244c981e65c86e8114a8d18edb6211891f6725251753e1c471374408deb172e4b162ee4a69a35ae229af5005c87bf6821967835d89b5"

RPROVIDES:${PN} += "ninja \
rpm-macro-ninja-build \
rpm-macro-ninja-install \
rpm-macro-ninja-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
