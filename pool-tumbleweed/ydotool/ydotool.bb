SUMMARY = "Generic command-line automation tool (no X!)"
DESCRIPTION = "ydotool is not limited to Wayland. You can use it on anything as long as it \
accepts keyboard/mouse/whatever input. For example, X11, text console, \
'RetroArch OS', fbdev apps (fbterm/mplayer/SDL1/LittleVGL/Qt Embedded), etc."
LICENSE = "AGPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "ydotool-1.0.4-2.5.aarch64.rpm"
RPM_HASH = "b17c20a2fdcaf2c0b8e743f592c7203d0ef89d899aacf182212576264f2866dc04c0bdefd4b72cba70ae1d7d21a94644acf57250a71e45a9e50b0c32e6d2f29d"

RPROVIDES:${PN} += "ydotool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
