SUMMARY = "GUI for GNUnet Messenger service"
DESCRIPTION = "A GTK based UI using the GNUnet Messenger service"
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "gnunet-messenger-gtk-0.11.0-1.6.aarch64.rpm"
RPM_HASH = "f66c457f743d874a37c896992c7975d25ec83ee092bdf8f32e38f9d5954d6d7d637eba77d9d04f3a42f5e801d0a3df47fcb01fc334355ab13d7535568eb62a1b"

RPROVIDES:${PN} += "gnunet-messenger-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnunetchat.so \
libgnunetutil.so.20 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libnotify.so.4 \
libpipewire-0.3.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libqrencode.so.4 \
libunistring.so.5"

inherit rpm
