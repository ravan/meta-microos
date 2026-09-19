SUMMARY = "Printers plug for Switchboard"
DESCRIPTION = "This plug configures all available printers."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-printers-8.0.2-1.4.aarch64.rpm"
RPM_HASH = "1e1872785c8cee034a8864fc9b4301126ab824bc8a6e759f836160bbe45218f7e737ce47955e7e2f86a5fd58f9804d33223b3944fe24ea2fd922eec465eba8ea"

RPROVIDES:${PN} += "libio.elementary.settings.printers.so \
switchboard-plug-printers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcups.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
