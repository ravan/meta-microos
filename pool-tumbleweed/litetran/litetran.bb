SUMMARY = "A translator on Qt"
DESCRIPTION = "LiteTran is a GUI for text translation (like Yandex.Translate). \
 \
 * Translate by text selection: select text, press the key combination \
   (Ctrl+Shift+T by default), and get the translation result in \
   a pop-up. It will not be necessary to open a web browser for \
   translation. \
 * Text speech (up to 100 characters). \
 * 37 supported languages."
LICENSE = "GPL-3.0-or-later"

PV = "1.3+git20161111"

RPM_NAME = "litetran-1.3+git20161111-5.3.aarch64.rpm"
RPM_HASH = "c7a59b856c73e31676c69e980f78f4e2cc94ef08532f5fb8e43bb690cbad395ac9ec5ff7d0b0e0aa001e82957bebc153d7cd7ec869d582f146b584b0dfc39657"

RPROVIDES:${PN} += "litetran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
