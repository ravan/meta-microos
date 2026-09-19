SUMMARY = "Object database, tag/metadata database, search tool and indexer"
DESCRIPTION = "tinysparql is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
It consists of a common object database that allows entities to \
have an almost infinite number of properties, metadata (both \
embedded/harvested as well as user definable), a comprehensive \
database of keywords/tags and links to other entities. \
 \
It provides context linking and audit trails for file objects. \
It has the ability to index, store, harvest metadata, retrieve \
and search all types of files and other first class objects."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "tinysparql-3.11.1-1.3.aarch64.rpm"
RPM_HASH = "cac45561960755fb3eb07d8658268f95ad06f9dc5893fd31ea28fd250c1540e7aec7d964de65d4aa4bdfe1ac653297ced5368aa551935ccc429db00d8f5045c5"

RPROVIDES:${PN} += "libtracker-http-soup3.so \
libtracker-parser-libicu.so \
tinysparql \
tracker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstemmer.so.0d \
libtinysparql-3.0.so.0 \
libxml2.so.16"

inherit rpm
