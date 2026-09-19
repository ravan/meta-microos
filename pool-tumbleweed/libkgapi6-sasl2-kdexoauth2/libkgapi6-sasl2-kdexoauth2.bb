SUMMARY = "Cyrus SASL plugin for using Google's XOAUTH"
DESCRIPTION = "This package provides a Cyrus SASL plugin to use Google's XOAUTH authentication \
for receiving and sending mail through Google servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkgapi6-sasl2-kdexoauth2-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2d9506f55a08ad55487098d33685691c5e32c00cc884b6beec8c5f35561bd887b235d9e5930d7bdecf822878c302db7cb0f1a448cc96c4e980910088fa21ff6c"

RPROVIDES:${PN} += "libkdexoauth2.so.3 \
libkgapi6-sasl2-kdexoauth2 \
sasl2-kdexoauth2 \
sasl2-kdexoauth2-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
