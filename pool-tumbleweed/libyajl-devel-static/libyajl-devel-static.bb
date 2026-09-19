SUMMARY = "Yet Another JSON Library (Static Library)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for linking statically \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-static-2.1.0-9.6.aarch64.rpm"
RPM_HASH = "a23a3828531e46c850eb4e67ece602927ff8ab83a50e1531363744bd31c218b594db39f7cc2a0a7aaa9b9108857fa10f40a66c05b691b24058ac92fe6575e0a1"

RPROVIDES:${PN} += "libyajl-devel-static"

RDEPENDS:${PN} += "libyajl-devel"

inherit rpm
