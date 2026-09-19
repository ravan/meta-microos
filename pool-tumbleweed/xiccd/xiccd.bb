SUMMARY = "X11 ICC Daemon"
DESCRIPTION = "xiccd is a bridge between colord and the X server. Its tasks are: \
 \
 * to enumerate displays and register them in colord, \
 * to create default ICC profiles based on EDID data, \
 * to apply ICC profiles provided by colord, \
 * and to maintain user's private ICC storage directory. \
 \
It does basically the same as the gnome-settings-daemon colour plugin \
or colord-kde without depending on any particular desktop nor the \
GTK+ libraries. \
 \
The primary goal of xiccd is providing colour profile support for \
desktop environments other than GNOME and KDE that do not support \
native colour management yet, such as MATE, Xfce, LXDE, to name a \
few."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "xiccd-0.4.1-1.4.aarch64.rpm"
RPM_HASH = "82b2aa439aa986edd1411f90f5d382544e64d889893b7a9e076b467bfa12caca3a5a1ae93b96032fc2e2aaead052254060d026a6f7218a76aaec750ff192f9cc"

RPROVIDES:${PN} += "xiccd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcolord.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
