SUMMARY = "Sideload flatpaks on the Pantheon Desktop"
DESCRIPTION = "Sideload is a simple application that lets users install flatpaks."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.1"

RPM_NAME = "pantheon-sideload-6.3.1-1.4.aarch64.rpm"
RPM_HASH = "c6f533642d9e5097c6055bb817db91142bb8bb370aec8e5030c57ed2a5c3b38bdfe4f7a1c1033a7624db38e1b3f46ea731aa38649a8ab84109257f5108096ac3"

RPROVIDES:${PN} += "elementary-sideload \
pantheon-sideload"

RDEPENDS:${PN} += "flatpak \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflatpak.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libxml2.so.16"

inherit rpm
