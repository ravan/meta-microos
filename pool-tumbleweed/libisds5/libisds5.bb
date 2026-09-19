SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds5-0.11.2-2.12.aarch64.rpm"
RPM_HASH = "a7d3ece4b73181bf4a6a5ed20725023089914f7bf05364b8ce54e75103bead6104daec92621a8c6a3fcc988ab5c53fcdc357dace2d4d52bc3a450484777796c3"

RPROVIDES:${PN} += "libisds.so.5 \
libisds5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libgpgme.so.45 \
libxml2.so.16"

inherit rpm
