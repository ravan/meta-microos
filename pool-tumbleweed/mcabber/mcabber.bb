SUMMARY = "Modular XMPP client on ncurses"
DESCRIPTION = "mcabber is a small XMPP console client on ncurses. It features \
SSL support, history logging, external actions, OTR support, \
conferences (MUC) support."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "mcabber-1.1.2-3.6.aarch64.rpm"
RPM_HASH = "2d75272af8dd5997065167d60bed4d2f80db084201fbe3c2bd228f28134567ab381e96f3db97433fbf06b569b5c8f2a1e6846ed8294883a842e44aa6f481144b"

RPROVIDES:${PN} += "libbeep.so \
libfifo.so \
liburlregex.so \
libxttitle.so \
mcabber"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgpgme.so.45 \
libloudmouth-1.so.0 \
libncursesw.so.6 \
libotr.so.5 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
