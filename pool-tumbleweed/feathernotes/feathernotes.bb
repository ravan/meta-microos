SUMMARY = "Qt-based plaintext editor"
DESCRIPTION = "FeatherNotes is a lightweight Qt hierarchical notes-manager for \
Linux. It is independent of any desktop environment and has: \
 \
* Support for rich text formatting, image embedding and inserting \
  editable tables \
* Drag-and-drop capability for moving nodes and also for embedding \
  images \
* A tray icon for quick access on any desktop \
* Saving and restoring of size (and also position under X11) \
* Compact but complete search and replacement widgets \
* The ability to include searchable tags (hidden info on each node) \
* Support for optional node icons \
* Support for local and remote hyperlinks (bookmarks) \
* Text zooming \
* Printing and exporting to HTML and PDF \
* Password protection \
* Auto-saving \
* Optional spell checking with Hunspell"
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "feathernotes-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "1f26f291c4c65ad45986464e536d5830f2f1defaa628d441f5fb3919e0a2802c6f59dbb5ecb8fe31eee24a58f68f0f1f0e70ae0e844bfbae510dffbe9a80364f"

RPROVIDES:${PN} += "feathernotes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
