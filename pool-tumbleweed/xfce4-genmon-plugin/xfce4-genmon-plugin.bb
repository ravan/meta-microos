SUMMARY = "Generic Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Generic Monitor plugin is intended for custom monitoring tasks and \
periodically spawns a given application, captures its output and displays the \
result in form of an image, a bar, a button and a personalized tooltip in the \
panel."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "xfce4-genmon-plugin-4.3.0-1.4.aarch64.rpm"
RPM_HASH = "a0f41a7dc8de36560f2bf81173ad15ff3ba16349bf48dda08e22121a7eee2f0fe8cfeaac97696e9c51da6a3055e388f0392b2113f4eeeaae04695a459f2e9e64"

RPROVIDES:${PN} += "libgenmon.so \
xfce4-genmon-plugin \
xfce4-panel-plugin-genmon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
