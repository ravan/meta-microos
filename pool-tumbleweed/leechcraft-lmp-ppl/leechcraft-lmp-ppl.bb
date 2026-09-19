SUMMARY = "LeechCraft Portable Player Logging Module"
DESCRIPTION = "This package provides Portable Player Logging support for the LeechCraft audio player."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-ppl-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "8c6d0a280f81cef590f8c4e4ff4acfc7df0fcd3add6ba7c7e44b786908eb2a59086a0e4dc567ebec11b03bcd90d53ca807de5c1ce658509f5969ea66ab4049c1"

RPROVIDES:${PN} += "leechcraft-lmp-ppl \
libleechcraft-lmp-ppl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
