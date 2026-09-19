SUMMARY = "Libpurple/Pidgin plugin supporting microblogging"
DESCRIPTION = "This is a libpurple Pidgin, Finch, etc plugin which treats \
microblogging sites GNU social, Twitter as IM protocols."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "libpurple-plugin-prpltwtr-0.14.0-2.9.aarch64.rpm"
RPM_HASH = "c957c424d5417d85c6f9d62c3dd7536bc96aed42e3443dc83b0ddfa392adf2b5b89fde989305cf39136f3067b0f77261920723f58f704deb75c75162287e6101"

RPROVIDES:${PN} += "libprpltwtr-statusnet.so \
libprpltwtr-twitter.so \
libprpltwtr.so \
libpurple-plugin-prpltwtr \
pidgin-prpltwtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpurple.so.0"

inherit rpm
