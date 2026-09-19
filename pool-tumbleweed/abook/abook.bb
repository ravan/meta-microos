SUMMARY = "Text-based addressbook program"
DESCRIPTION = "Abook is a text-based addressbook program designed to \
use with mutt mail client."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-0.6.1-4.5.aarch64.rpm"
RPM_HASH = "1714f42dd1245dafa0c3df353c28e9b2b7813488741b9af57f5d903af09e7d1f65c75e0e5264813a58bde9880726518d1f1a720d1e31bdb8a2835c5182e1b49c"

RPROVIDES:${PN} += "abook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
