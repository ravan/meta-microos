SUMMARY = "Shared library for rxp"
DESCRIPTION = "The current version of RXP supports XML 1.1, Namespaces 1.1, xml:id, \
and XML Catalogs. To use an XML Catalog, set the environment variable \
XML_CATALOG_FILES to a space-separated list of catalog files. \
 \
RXP was written by Richard Tobin at the Language Technology Group, \
Human Communication Research Centre, University of Edinburgh. \
 \
A simple application (called rxp) is provided. It parses and writes XML \
data, optionally expanding entities, defaulting attributes, and \
translating to a different output encoding. \
 \
This package contains shared library"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "librxp0-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "5fdf2bce7a96c70ea09a12645bef2e14b61061a212d5753471138a34ba2b18aa83ac60881332f8a20edc5e06c479aba6d64be60799b960267394d0f7bf78d917"

RPROVIDES:${PN} += "librxp.so.0 \
librxp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
