SUMMARY = "Semantic patch utility"
DESCRIPTION = "Coccinelle is a program matching and transformation engine which \
provides the language SmPL (Semantic Patch Language) for specifying \
desired matches and transformations in C code."
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "coccinelle-doc-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "c1b7240285313d76e810174eb12d0731491a37663a8d51b260893873d8cfe305c0a4b1b301335fc933728118a34037ab4a1f734a3b8df908c3b82c8e2c4a5e49"

RPROVIDES:${PN} += "coccinelle-doc"

RDEPENDS:${PN} += ""

inherit rpm
