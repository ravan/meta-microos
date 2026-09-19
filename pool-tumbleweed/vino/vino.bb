SUMMARY = "GNOME VNC Server"
DESCRIPTION = "A VNC Server for GNOME"
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "vino-3.22.0-9.20.aarch64.rpm"
RPM_HASH = "d482a0ac35dc130d24fc65db4acb868b9c2674c8d7da9570da25b22c1276a8b72733217e5e88971230bc6eb5c2013b6adcf7352245982993ce4f31828845d39f"

RPROVIDES:${PN} += "vino"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libnotify.so.4 \
libsecret-1.so.0 \
libz.so.1"

inherit rpm
