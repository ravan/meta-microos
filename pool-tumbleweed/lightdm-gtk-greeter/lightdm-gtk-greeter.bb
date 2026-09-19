SUMMARY = "Simple display manager (GTK+ greeter)"
DESCRIPTION = "A LightDM greeter that uses the GTK+ toolkit. \
This is the reference implementation of a LightDM greeter based on the Gtk \
toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-2.0.8-1.25.aarch64.rpm"
RPM_HASH = "ce23400f5bb9d2e50bf99a7c56691abf5343e02e7ea208f9a59f411c953a23885fba257cb33e263e7d9341782a27e1fde8ac551e1a64504795819783fc9cfab5"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-gtk-greeter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblightdm-gobject-1.so.0 \
libm.so.6 \
lightdm \
lightdm-gtk-greeter-branding \
update-alternatives"

inherit rpm
