SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "Libchipcard allows access to smart cards. It provides basic access \
to memory and processor cards and has special support for German \
medical cards, German 'Geldkarten,' and HBCI (home banking) cards (both \
type 0 and type 1). It accesses the readers via CTAPI or PC/SC \
interfaces and has successfully been tested with Towitoko, Kobil, and \
Reiner-SCT readers."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-5.1.6-2.9.aarch64.rpm"
RPM_HASH = "02dcc92164253b0ee4bbccbade3ed774fadfa802c41fd465902ef1d2c26d472e740479336f62692c0ab0ca72eef3a3444ba7c64cf21565eda0e9c4fd2d27fffe"

RPROVIDES:${PN} += "config-libchipcard \
libchipcard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchipcard.so.6 \
libgcc-s.so.1 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
