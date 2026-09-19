SUMMARY = "Development files for the tinysparql indexer"
DESCRIPTION = "tinysparql is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This subpackage contains the headers to make use of its libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "tinysparql-devel-3.11.1-1.3.aarch64.rpm"
RPM_HASH = "7ccdf73690b8baa7913b67c9d205a64f7623a9308580377827214776f073431a986d0ed218b690cc41739b6c030d90da4fc8359681a7a22504256b55a8852241"

RPROVIDES:${PN} += "pkgconfig-tinysparql-3.0 \
pkgconfig-tracker-sparql-3.0 \
tinysparql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracker-sparql-3-0-0 \
pkgconfig-avahi-client \
pkgconfig-avahi-glib \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
pkgconfig-tinysparql-3.0 \
typelib-1-0-Tracker-3-0"

inherit rpm
