SUMMARY = "Sparql library for tinysparql"
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

RPM_NAME = "libtracker-sparql-3_0-0-3.11.1-1.3.aarch64.rpm"
RPM_HASH = "2ef32333127e53b6a67b786b0e0e89d1ac2dff7d0724ea3281db88e133b3024f41bfe8f1920d9466dc51a04cef16d93c2bf8c0e22cfc28734ae3b7e967a4c3c2"

RPROVIDES:${PN} += "libtinysparql-3.0.so.0 \
libtracker-sparql-3-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
