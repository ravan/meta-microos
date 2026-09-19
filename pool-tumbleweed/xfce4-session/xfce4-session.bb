SUMMARY = "Xfce Session Manager"
DESCRIPTION = "xfce4-session is the session manager for the Xfce desktop environment."
LICENSE = "GPL-2.0-only"

PV = "4.20.4"

RPM_NAME = "xfce4-session-4.20.4-1.3.aarch64.rpm"
RPM_HASH = "f9aec8daa9b35e3e551301b2e61a547f302706d629f1dbd9d2b978685515cca53ef2cbcf8bfee8e879ceeeaee547f8982524736c9d40be1878b8faf98aafc1a0"

RPROVIDES:${PN} += "config-xfce4-session \
xfce4-session"

RDEPENDS:${PN} += "/usr/bin/sh \
iceauth \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfce4windowing-0.so.0 \
libxfconf-0.so.3 \
systemd \
update-alternatives \
xfce4-session-branding \
xfce4-settings \
xfconf"

inherit rpm
