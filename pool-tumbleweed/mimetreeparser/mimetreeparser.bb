SUMMARY = "Library to parse MIME trees"
DESCRIPTION = "mimetreeparser is a parser for MIME trees. Given a MIME tree, it extracts \
the parts (text, html...) and attachments."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "mimetreeparser-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8fbce04844f420c6fd5786f939e415311693f8f6beeda3b959d5042b6758c19fcd4dda171dea7833a44597356e3b70a9c6d17eeec5ea578c603791a73c62fe3c"

RPROVIDES:${PN} += "mimetreeparser"

RDEPENDS:${PN} += ""

inherit rpm
