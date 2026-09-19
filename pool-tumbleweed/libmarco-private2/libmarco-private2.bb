SUMMARY = "MATE window manager shared libraries"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libmarco-private2-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "0129226758c27b503e73d3b37d34a2e9053e20efcfad2894816799f220569aee4c7c4fa056857b767a5bd121a98d510f72474da86b305ca7b122c49a29e3500d"

RPROVIDES:${PN} += "libmarco-private.so.2 \
libmarco-private2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXpresent.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libm.so.6 \
libmate-desktop-2.so.17 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0"

inherit rpm
