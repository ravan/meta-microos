SUMMARY = "A TUI bluetooth manager for Linux"
DESCRIPTION = "bluetuith is a TUI-based bluetooth connection manager, which can interact with bluetooth adapters and devices. It aims to be a replacement to most bluetooth managers, like blueman. \
This project is currently in the alpha stage."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "bluetuith-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "efac973c6865d124d67a65b7fc13b2d4892b9eab45dcdd6e88276ae59f4facbf2c993a238d775f1229a7382d7c267688439b33f3cb84fd07f57a1a39ab06e57a"

RPROVIDES:${PN} += "bluetuith"

RDEPENDS:${PN} += "bluez \
dbus-1 \
libc.so.6"

inherit rpm
