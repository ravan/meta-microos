SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "Apache-2.0+ | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.9.33"

RPM_NAME = "librasqal3-0.9.33-3.5.aarch64.rpm"
RPM_HASH = "308ffac2992d01e920eccf612e05936810fef316702dfd720b7656c9e7bd5e436795ef2f08ea23ed6d64759c08c5eb044fbec922167243b1bbe55d09b548184b"

RPROVIDES:${PN} += "librasqal.so.3 \
librasqal3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpfr.so.6 \
libpcre2-8.so.0 \
libraptor2.so.0"

inherit rpm
