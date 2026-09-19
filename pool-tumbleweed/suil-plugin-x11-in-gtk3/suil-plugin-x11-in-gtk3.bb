SUMMARY = "Shared object for GTK3 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK3 hosts displaying X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-plugin-x11-in-gtk3-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "9b6b3e0bc15a767582a5467d1b8526fbd3b7e7867c423b54ff0d595023368ba1c1c0fa15c4cc35e364afe918f9ac5638ff82dcbb1775e0f7e6afaf91f122f8b0"

RPROVIDES:${PN} += "libsuil-x11-in-gtk3.so \
suil-plugin-x11-in-gtk3"

RDEPENDS:${PN} += "gtk3-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsuil-0-0"

inherit rpm
