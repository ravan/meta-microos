SUMMARY = "Graphical text editor and Notepad clone"
DESCRIPTION = "Leafpad is a GTK+ based text editor. The user interface is similar to \
'notepad'. It uses a Single Document Interface to set out windows to view at a \
time, and purposely uses no toolbar. Character encoding is autodetected."
LICENSE = "GPL-2.0-only"

PV = "0.8.19"

RPM_NAME = "leafpad-0.8.19-1.13.aarch64.rpm"
RPM_HASH = "f8e42090d2a00bd438a1ef177fe7ad4824c6801d9f2cd9928a7123b9716f1cf55e1f4002f2449c92be7b4cbeb3187e54c2a8d2f0cd10582834fd391369068d56"

RPROVIDES:${PN} += "leafpad"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
