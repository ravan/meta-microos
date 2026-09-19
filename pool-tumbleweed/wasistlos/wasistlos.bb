SUMMARY = "WhatsApp for Linux"
DESCRIPTION = "An unofficial WhatsApp desktop application written in C++. \
Previously named whatsapp-for-linux."
LICENSE = "GPL-3.0-only"

PV = "1.7.0~20241019.b483456"

RPM_NAME = "wasistlos-1.7.0~20241019.b483456-1.7.aarch64.rpm"
RPM_HASH = "ab78002f44d4129782618b6f504d0db64cf5ac5ee0f563bab87ae7acdcf696afefa69d934df33b93c2e07067bb349b84ec415f927bb64fb3c3d0714c920017c6"

RPROVIDES:${PN} += "wasistlos \
whatsapp-for-linux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libwebkit2gtk-4.1.so.0"

inherit rpm
