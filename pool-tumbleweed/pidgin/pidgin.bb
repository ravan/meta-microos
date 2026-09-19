SUMMARY = "Multiprotocol Instant Messaging Client"
DESCRIPTION = "Pidgin is a messaging application which lets you log in to accounts \
on multiple chat networks simultaneously. \
 \
Pidgin is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "pidgin-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "cd97ba5537d269624f6f748fde421666daf19098fdc82b0180373d6d1e434a9702f81b7acb59e5d6f0f31dc6acd854e21a26530a85dee126b598c3d00388e551"

RPROVIDES:${PN} += "perl-Pidgin \
pidgin"

RDEPENDS:${PN} += "ca-certificates-mozilla \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXss.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkspell.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpurple \
libpurple.so.0 \
perl-base"

inherit rpm
