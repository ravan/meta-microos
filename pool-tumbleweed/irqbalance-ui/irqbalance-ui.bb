SUMMARY = "UI for IRQ balance Daemon"
DESCRIPTION = "Text UI for the IRQ balance daemon."
LICENSE = "GPL-2.0-only"

PV = "1.9.5.3.git+48ab93a"

RPM_NAME = "irqbalance-ui-1.9.5.3.git+48ab93a-1.5.aarch64.rpm"
RPM_HASH = "7995661999587049d32ea1684cc6e2fda885453b116787eff9c846fcb8069a765a61c5c6740f91fef44efac8fb1d9ca64255f84a9cbf8a17a7c997bf601c007f"

RPROVIDES:${PN} += "irqbalance-ui"

RDEPENDS:${PN} += "irqbalance \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
