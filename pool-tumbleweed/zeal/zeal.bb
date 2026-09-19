SUMMARY = "Offline API documentation browser"
DESCRIPTION = "Zeal is an offline API documentation browser inspired by Dash \
(OS X app). \
 * Quickly search documentation using Alt+Space (or a customised) \
   hotkey to display Zeal from any place in your workspace. \
 * Search in multiple sets of documentation at once. \
 * Don't be dependent on your internet connection. \
 * Integrate Zeal with Emacs, Sublime Text, or Vim. See Usage » \
   Editor plugins for details."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "zeal-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "9f951440d707c355c6463a209f72dd5f64203f59cb1fc768cd9e26b3e5d5a114e572d79f70b10f2c7c73147e8d4fb7a6f23fffdd39be6419132e200a89f5a3b6"

RPROVIDES:${PN} += "zeal"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtomlplusplus.so.3 \
libz.so.1 \
update-desktop-files"

inherit rpm
