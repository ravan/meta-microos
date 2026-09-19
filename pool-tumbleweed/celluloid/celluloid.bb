SUMMARY = "Simple GTK+ frontend for MPV"
DESCRIPTION = "Celluloid is a simple GTK+ frontend for MPV."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "celluloid-0.30-1.3.aarch64.rpm"
RPM_HASH = "e5b7571e3ee6affecd91079e1e3458304f1d95139e976497a4250a8ec7d2758344634e617ccd89a901bb6e36a97bf54e2f183e7d7158b972b99072e4ec6ae87b"

RPROVIDES:${PN} += "celluloid \
gnome-mpv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libepoxy.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libmpv.so.2"

inherit rpm
