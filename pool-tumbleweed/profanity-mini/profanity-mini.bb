SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, and \
inspired by Irssi. \
 \
This package holds a minimal version, with most options not compiled \
in to have fewer dependencies. It is thus well suited for headless \
servers."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.18.2"

RPM_NAME = "profanity-mini-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "674c4d3f03dbdc95044da4dedd8f173affbb8569e14adf7c184ec97a51a574f32dacf33f8211816747be544511d222f1a70a3e3b4f74a8dc71d08ee3bfac5a06"

RPROVIDES:${PN} += "profanity-binary \
profanity-mini"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libm.so.6 \
libncursesw.so.6 \
libomemo-c.so.0 \
libotr.so.5 \
libpython3.13.so.1.0 \
libqrencode.so.4 \
libreadline.so.8 \
libsqlite3.so.0 \
libstrophe.so.0 \
libtinfo.so.6"

inherit rpm
