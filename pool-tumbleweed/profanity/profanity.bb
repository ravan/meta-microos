SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, and \
inspired by Irssi."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.18.2"

RPM_NAME = "profanity-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "11fe03eed680a2e39763225b8f10f30c7326589b1879b1645d2ede3e131a385b8ad7b23fa4789fb2a34217d73d6c9746e572326c7dc317d0a8063f3975362095"

RPROVIDES:${PN} += "profanity \
profanity-binary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libm.so.6 \
libncursesw.so.6 \
libnotify.so.4 \
libomemo-c.so.0 \
libotr.so.5 \
libpython3.13.so.1.0 \
libqrencode.so.4 \
libreadline.so.8 \
libsqlite3.so.0 \
libstrophe.so.0 \
libtinfo.so.6"

inherit rpm
