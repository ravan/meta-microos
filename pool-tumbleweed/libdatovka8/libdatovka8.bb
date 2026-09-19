SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.4"

RPM_NAME = "libdatovka8-0.7.4-1.1.aarch64.rpm"
RPM_HASH = "b61fdb923a9a502f2e110faab1bcec8ec326915286e8551bdc92e7dc8ee00af128d883c5687772e6bda94e19bf678696225a911aaade318d55f2b35d04468164"

RPROVIDES:${PN} += "libdatovka.so.8 \
libdatovka8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libgpgme.so.45 \
libjson-c.so.5 \
libxml2.so.16"

inherit rpm
