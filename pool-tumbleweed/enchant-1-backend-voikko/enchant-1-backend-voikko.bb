SUMMARY = "Generic Spell Checking Library - Voikko Plugin"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-voikko-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "121908a1ff5ed0a1b2004dab84dcbd3a2373d8aad3e5cba4d2cc8f807b6053d8bb798493647f79ad2db695a5612204c03cee37110833e95bbc9302c805c3bcdc"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backend-voikko \
libenchant-voikko.so \
locale-enchant-1-fi"

RDEPENDS:${PN} += "enchant-1-backends \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0 \
libvoikko.so.1"

inherit rpm
