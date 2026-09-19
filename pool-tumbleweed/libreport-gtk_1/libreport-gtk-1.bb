SUMMARY = "GTK front-end for libreport"
DESCRIPTION = "Applications for reporting bugs using libreport backend"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-gtk_1-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "13f7efb7a3b0c0b0a7259a3b9425b0ba76c0ffe687d1708a6e985cfd0246adb57c13030d3f0664d53d128567921c66028fe675232fb49bf7057c4583bddee28c"

RPROVIDES:${PN} += "libreport-gtk-1 \
libreport-gtk.so.1 \
report-gtk"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libreport-2 \
libreport-plugin-reportuploader \
libreport.so.2"

inherit rpm
