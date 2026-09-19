SUMMARY = "The mail indexer"
DESCRIPTION = "A global-search and tag-based email system that can be used from a terminal or \
from within a text editor. Notmuch provides a library interface so that its \
indexing/searching/tagging features can be integrated elsewhere. \
 \
Notmuch is not much of an email program. It does not receive messages \
(no POP or IMAP support), it does not send messages (no mail \
composer, no network code at all). It does email search, for which it \
uses the Xapian library."
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "notmuch-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "adbca34cf39bec6f6f3869669c1e782fdd0c9a5e60ca39eb17060c9a098be6a374bf92a6340b587bc88bd29bd8f342817fa8a9e60e721da5fead6d24ff98366a"

RPROVIDES:${PN} += "notmuch"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libnotmuch.so.5 \
libtalloc.so.2 \
libz.so.1"

inherit rpm
