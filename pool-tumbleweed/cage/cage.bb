SUMMARY = "Wayland Kiosk"
DESCRIPTION = "A Wayland Kiosk."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "cage-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "61db8982b52222f7a6c83ea9bb02465857434441f9f665456b58d4751668fe2881c9ab1c289d7c5332a369c824948917718215c450e3ea146c5f133db07b94f4"

RPROVIDES:${PN} += "cage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-server.so.0 \
libwlroots-0.20.so \
libxkbcommon.so.0"

inherit rpm
