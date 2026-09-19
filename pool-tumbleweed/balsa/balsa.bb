SUMMARY = "The GNOME Mail Program"
DESCRIPTION = "An e-mail client for GNOME. It supports \
* the local mailbox formats mbox, maildir and mh \
* MIME support, nested mailboxes \
* POP3 and IMAP mail access \
* printing, spell checking \
* address book with GnomeCard \
* GPG/OpenPGP mail signing and encryption"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "balsa-2.6.5-1.6.aarch64.rpm"
RPM_HASH = "7899562f06f3522c39fd744979037b160c3953f7efb80b8cd7f60ec5d3e3eaebb451c5d0e626cdeda481145eb418d71fe1eb52a313bce9d748e88684de97c793"

RPROVIDES:${PN} += "balsa \
config-balsa \
libhtmlfilter.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libical.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
