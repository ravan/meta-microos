SUMMARY = "WhatsApp for Linux"
DESCRIPTION = "An unofficial WhatsApp desktop application written in C++."
LICENSE = "GPL-3.0-only"

PV = "1.6.5"

RPM_NAME = "whatsapp-for-linux-1.6.5-1.7.aarch64.rpm"
RPM_HASH = "7594f33cd96b26d5abca426365df65cd7f71b479fa79f7572874c8b7298b8abc8fb248bea865a3f58de77e18b00d989563f16a91455a481b2d22b175a82844bc"

RPROVIDES:${PN} += "whatsapp-for-linux"

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
