SUMMARY = "RDF Parser Toolkit"
DESCRIPTION = "Raptor is the RDF Parser Toolkit for Redland that provides a set of \
standalone RDF parsers, generating triples from RDF/XML or N-Triples."
LICENSE = "Apache-2.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.0.16"

RPM_NAME = "libraptor2-0-2.0.16-5.8.aarch64.rpm"
RPM_HASH = "2b0bdd6f356f202d2b7bc10da3b853cb45fc59aebe4083d63ae80a7e6f301b9f6515e34906914a74135f1581051c9dc8ce8285a34ba25d049eff27a320bf3b3c"

RPROVIDES:${PN} += "libraptor2-0 \
libraptor2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libicuuc.so.78 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
