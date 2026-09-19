SUMMARY = "Switchboard plug to show system information"
DESCRIPTION = "About plug for Switchboard. \
 \
This plug displays information about the system."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.3"

RPM_NAME = "switchboard-plug-about-8.2.3-1.2.aarch64.rpm"
RPM_HASH = "46753fbfb4c1777086e2fc4804a9ae3fb9ebc10a3e7d3775c3051addb552167ca414d0366119e91df4575829f4e718fc21696a63ece29ba09679b71cc7f7d717"

RPROVIDES:${PN} += "libsystem.so \
switchboard-plug-about"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libappstream.so.5 \
libc.so.6 \
libfwupd.so.3 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libsoup-3.0.so.0 \
libswitchboard-3.so.0 \
libudisks2.so.0 \
switchboard \
switcheroo-control"

inherit rpm
