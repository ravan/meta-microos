SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.9.2"

RPM_NAME = "aqbanking-ofx-6.9.2-1.2.aarch64.rpm"
RPM_HASH = "0274a5a55474f647a7f750a41596792f7d59acfaa5fed87c79bdac339dec5f79ef8ff904f97d80c6d8e44d3cf7a9689231536580375eeaedee7cc0b5eec837f5"

RPROVIDES:${PN} += "aqbanking-ofx"

RDEPENDS:${PN} += "/sbin/ldconfig \
aqbanking \
ld-linux-aarch64.so.1 \
libaqbanking.so.44 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
