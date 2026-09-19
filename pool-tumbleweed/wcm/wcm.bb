SUMMARY = "Wayfire Config Manager"
DESCRIPTION = "Wayfire Config Manager https://wayfire.org/."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wcm-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "e008e85c0bca566e388e52940f192832d2cbd1f64ca2b5f8d0db634e4430730219fbbe7174a9a51ab33a6ccd1a8a4d389bd5c94c7a15cb6778bd0034a3cb2d03"

RPROVIDES:${PN} += "wcm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libevdev.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwf-config.so.1 \
libxkbregistry.so.0 \
libxml2.so.16 \
wayfire \
wdisplays"

inherit rpm
