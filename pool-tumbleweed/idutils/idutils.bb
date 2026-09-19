SUMMARY = "Language-Independent Identifier Database Tool"
DESCRIPTION = "Mkid is a simple, fast, high-capacity, and language-independent \
identifier database tool.  Actually, the term identifier is too \
limiting--mkid stores tokens, be they program identifiers of any form, \
literal numbers, or ordinary words.  Database queries can be issued \
from the command line or from within Emacs, serving as an augmented \
tags facility."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "idutils-4.6-5.9.aarch64.rpm"
RPM_HASH = "a81de2d6e4ef7f69d5678912828e40f457ac8efb17803d32ea85d9a84098975d057ffc5601a00b3e2ff9778907c28b7f46645e2a16e1879b75cb0a0f68b51598"

RPROVIDES:${PN} += "config-idutils \
id-utils \
idutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
