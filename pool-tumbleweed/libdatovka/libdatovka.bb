SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.4"

RPM_NAME = "libdatovka-0.7.4-1.1.aarch64.rpm"
RPM_HASH = "a4564debbb074fecc9d4af92efc4ff9af6953decb62d4a980b4bafefdabd342db1429445c90f70ba2918fa5a21112b27b5af5c8ea82975ff18224dc928d52515"

RPROVIDES:${PN} += "libdatovka"

RDEPENDS:${PN} += ""

inherit rpm
