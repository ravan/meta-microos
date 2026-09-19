SUMMARY = "Switchboard Bluetooth Plug"
DESCRIPTION = "This plug configures bluetooth devices."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-bluetooth-8.0.2-1.4.aarch64.rpm"
RPM_HASH = "e62aa20df2e66f205b9084617fd0e7a2b4486b58de3d988f745c00ae224f1ea3e7dbff01eff7d1bae5e36a5f8788840aeff1727c9ad8e36369114b23d300c572"

RPROVIDES:${PN} += "libbluetooth.so \
switchboard-plug-bluetooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
