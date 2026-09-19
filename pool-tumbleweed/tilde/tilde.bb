SUMMARY = "A text editor for the terminal"
DESCRIPTION = "Tilde is a text editor for the console/terminal, which provides an \
interface for people accustomed to GUI environments such as \
GNOME, KDE and Windows. For example, the short-cut to copy the \
current selection is Control-C, and to paste the previously copied \
text the short-cut Control-V can be used. As another example, the \
File menu can be accessed by pressing Alt-F."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "tilde-1.1.3-2.10.aarch64.rpm"
RPM_HASH = "ba3c5700e295f1f9fec8913d45a7b1eeb43399e715dfb3ef82b27522f3fe2437648031ec6d61bcb75460caba0ca677ef9627cec45a97fca2701d7a854cd88ae8"

RPROVIDES:${PN} += "tilde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libt3config.so.0 \
libt3highlight.so.2 \
libt3widget.so.2 \
libt3window.so.0 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
