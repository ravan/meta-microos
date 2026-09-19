SUMMARY = "Development Environment for Children"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-1.2.2-18.13.aarch64.rpm"
RPM_HASH = "3308c5c54fef9344de522f0614b6f661cfd41b68e90ff5a690d27990a369b0036c09e685fba193f525c401b6a2b1fff943998e12621a311e720309cd14cea107"

RPROVIDES:${PN} += "liblanguage.so.0 \
liblw.so.0 \
littlewizard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
