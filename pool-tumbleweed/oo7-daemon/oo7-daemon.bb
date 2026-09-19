SUMMARY = "A org.freedesktop.secrets server implementation"
DESCRIPTION = "A D-Bus Secret Service provider. Replacement of the gnome-keyring-daemon."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "oo7-daemon-0.4.3-2.8.aarch64.rpm"
RPM_HASH = "2fc1044df0a6516cac46576ae11bf2d0288db47dca647a9ab9b129b0647116078079e9de60795bc9578e2d002dcb5aa88e000c85bce129b2857d036f143a4010"

RPROVIDES:${PN} += "dbus-org.freedesktop.secrets \
dbus-org.gnome.keyring \
oo7-daemon"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
