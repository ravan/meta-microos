SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "Apache-2.0+ | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.9.33"

RPM_NAME = "rasqal-0.9.33-3.5.aarch64.rpm"
RPM_HASH = "98d29b09c971818198faec24fcc54ea22b8a939590531a129596a232f40b2715d1208de7173327f6d08e40ace7ef81c449a69954e97152925e0429be2cd66d21"

RPROVIDES:${PN} += "rasqal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0 \
librasqal.so.3 \
librasqal3"

inherit rpm
