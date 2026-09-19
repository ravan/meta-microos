SUMMARY = "Shared object for GTK2 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK2 hosts displaying X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-plugin-x11-in-gtk2-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "6b7379e77a1bdfbae587b458edc074b1c8deafcacb165596ec93535b242a82cf12c4581393383f2d583c05a3ebf9ac031a2e385682a4d396f77f7d705b136841"

RPROVIDES:${PN} += "libsuil-x11-in-gtk2 \
libsuil-x11-in-gtk2.so \
suil-plugin-x11-in-gtk2"

RDEPENDS:${PN} += "gtk2-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libsuil-0-0"

inherit rpm
