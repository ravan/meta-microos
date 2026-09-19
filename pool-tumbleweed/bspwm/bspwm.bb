SUMMARY = "A tiling window manager based on binary space partitioning"
DESCRIPTION = "A tiling window manager based on binary space partitioning. \
* It only responds to X events, and the messages it receives on a dedicated socket. \
* bspc is a program that writes messages on bspwm's socket. \
* bspwm doesn't handle any keyboard or pointer inputs: a third party program (e.g. \
sxhkd) is needed in order to translate keyboard and pointer events to bspc invocations."
LICENSE = "BSD-2-Clause"

PV = "0.9.12"

RPM_NAME = "bspwm-0.9.12-1.5.aarch64.rpm"
RPM_HASH = "f9ea9ff5838466748616eee5a71670e31a11b1d7cbeee29fa76cb343ab542a7b6d3d51f71f5e47e8d300a8c6ef9c5498d9efb4b3d86764e5a492fafbab7dde9a"

RPROVIDES:${PN} += "bspwm \
config-bspwm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb.so.1"

inherit rpm
