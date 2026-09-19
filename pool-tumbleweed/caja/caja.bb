SUMMARY = "File manager for the MATE desktop"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "caja-1.28.0-1.14.aarch64.rpm"
RPM_HASH = "0faa9d50494bac39f1bd819dc7c9cafbda2662b18ccfa0f29e18f299518b849e42a2064c126f16f04cb7e29af6793195947cd75ed9a77989dbb60bf48f071699"

RPROVIDES:${PN} += "caja \
mate-file-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcaja-extension.so.1 \
libexempi.so.8 \
libexif.so.12 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libmate-desktop-2.so.17 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libselinux.so.1 \
libxml2.so.16"

inherit rpm
