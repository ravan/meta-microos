SUMMARY = "A tool to perform actions on windows"
DESCRIPTION = "The tool lets you perform actions such as inspect, raise, lower, inject input on \
X11 windows. Xdo is compatible with both Xorg and Xwayland."
LICENSE = "BSD-2-Clause"

PV = "0.5.7"

RPM_NAME = "xdo-0.5.7-1.17.aarch64.rpm"
RPM_HASH = "f70a6ff37608bec8dd2a91b5eafc2c96e596824392d9f4c8c39da8b75374a8d3ac07c886aa431da751bdce9feec28c267ec35ad19e19e0cfd55292d0e8d416d2"

RPROVIDES:${PN} += "xdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-util.so.1 \
libxcb-xtest.so.0 \
libxcb.so.1"

inherit rpm
