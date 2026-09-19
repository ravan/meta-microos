SUMMARY = "Yet Another JSON Library (Development Environment)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for compiling and linking \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-2.1.0-9.6.aarch64.rpm"
RPM_HASH = "9e7d4928ff879f6550babc82fe772dbe0b2a33fc5b4bf4f5f93fd8cb0dadd6c563ea928c8496f17c28398c18736a7095a30fc258ad9672e41d857a781c95f923"

RPROVIDES:${PN} += "libyajl-devel \
pkgconfig-yajl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyajl2"

inherit rpm
