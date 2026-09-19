SUMMARY = "Tab Window Manager for the X Window System"
DESCRIPTION = "twm is a window manager for the X Window System. It provides \
titlebars, shaped windows, several forms of icon management, \
user-defined macro functions, click-to-type and pointer-driven \
keyboard focus, and user-specified key and pointer button bindings."
LICENSE = "HPND"

PV = "1.0.13.1"

RPM_NAME = "twm-1.0.13.1-1.6.aarch64.rpm"
RPM_HASH = "22f48a051aaa9f8eaeedb7e9fa35a8f712a61af2b8c63b715dc1428055368b59555c25c82fc39355bbdfe5e444a5eb5b43e65a0b6ac536858d19144526660142"

RPROVIDES:${PN} += "twm \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
