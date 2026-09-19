SUMMARY = "Keyboard and Font Utilities"
DESCRIPTION = "Load and save keyboard mappings. This is needed if you are not using \
the US keyboard map. This package also contains utilities for changing \
your console fonts. If you install this package, YaST includes an extra \
menu to allow you to choose between the different fonts. This package \
also includes fonts from the kbd_fonts.tar.gz package (by Paul \
Gortmaker) on Sunsite."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "kbd-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "1acfac3c9112855d999f41f43320f3d5f1a289f8747108a16460d9e67213f1076abf9c215922fdb1c7e65ccb01bc9f37d016adc050cae97b3369990a9b58ad9b"

RPROVIDES:${PN} += "kbd \
vlock"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkbdfile.so.1 \
libkeymap.so.1 \
libkfont.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libxkbcommon.so.0 \
xkeyboard-config"

inherit rpm
