SUMMARY = "SDDM configuration editor"
DESCRIPTION = "Configuration editor for SDDM similar to sddm-config-editor, but written in \
C++."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "sddm-conf-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "4667b3de61d6c009ce8908e4b6a5436f5933e0fac65732a863fb609f0ab5926b80a981aea92a3a345411c8db5770d15b4e33c47030505a678b77bcf2a359164a"

RPROVIDES:${PN} += "sddm-conf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
