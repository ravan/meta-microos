SUMMARY = "Gettext Catalog Editing Tool"
DESCRIPTION = "Poedit is an editor for gettext catalogs (.po files). It is built \
with the wxWidgets toolkit, providing a graphical approach to \
editing catalogs over launching vi and editing the file by hand."
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "poedit-3.9.1-1.2.aarch64.rpm"
RPM_HASH = "a2b322418adcbe0b416c2626875db14c9b18035dcd7afbc48d729d29832f5f3d412064fa6251ca9a4b8d1f0306c91f4a9c82cbbf088772075edb571052e956ac"

RPROVIDES:${PN} += "poedit"

RDEPENDS:${PN} += "gettext-tools \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcld2.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkspell3-3.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
liblucene++.so.0 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse.so.16.0.0"

inherit rpm
