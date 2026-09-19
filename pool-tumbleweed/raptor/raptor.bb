SUMMARY = "RDF Parser Toolkit"
DESCRIPTION = "Raptor is the RDF Parser Toolkit for Redland that provides a set of \
standalone RDF parsers, generating triples from RDF/XML or N-Triples."
LICENSE = "Apache-2.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.0.16"

RPM_NAME = "raptor-2.0.16-5.8.aarch64.rpm"
RPM_HASH = "dbad925762626782cd540f6b94b8d2796798de2766fb7b4f9851753b30aa4bc11e6d6f681a5fd2d8c8ce2b3e2b64130a1df6b804b3164afe52ef0dde7da8178c"

RPROVIDES:${PN} += "raptor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0"

inherit rpm
