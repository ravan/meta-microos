SUMMARY = "LeechCraft Device Monitor Module"
DESCRIPTION = "This package provides a devices monitor plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-devmon-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "09eb62e8c33e7f3c9994ffe3869743c01ccf520362a3b07a6f911f38d55206b0186446dd5e5a37ac2f5d9cab793195522cfba556a37063110f0946872382ff4e"

RPROVIDES:${PN} += "leechcraft-devmon \
libleechcraft-devmon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
