SUMMARY = "Switchboard Display Plug"
DESCRIPTION = "Switchboard plug to show display information."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-plug-display-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "73a1a2ba81faa0b8bacfc93f7583d4530e2954ed0a84b6d18044377adfb8181ad078f336bc796f0319ae03e4e540501d80b78299121e255fed59f2661dbae746"

RPROVIDES:${PN} += "libdisplay.so \
switchboard-plug-display"

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
