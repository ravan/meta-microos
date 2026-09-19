SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.9.2"

RPM_NAME = "aqbanking-ebics-6.9.2-1.2.aarch64.rpm"
RPM_HASH = "55fdc6f169e4e363495f69fc559be925020f3f3b6b907f85820fa70ebda6b8e9901ffc8e49711e9174e0493d31cd98370ec1ccab84fcbbef07c7012d0448282c"

RPROVIDES:${PN} += "aqbanking-ebics"

RDEPENDS:${PN} += "/sbin/ldconfig \
aqbanking \
ld-linux-aarch64.so.1 \
libaqbanking.so.44 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
