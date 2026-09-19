SUMMARY = "Library to use BRLTTY from applications -- Tcl Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "tcl-brlapi-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "9c26d252586dfb35ad85e304db55fcd211a84aabec153be73cb5202989967e58afe141447dc18e697ae493d22a5a26462b35365cafa9c93b47e1566f003c8cef"

RPROVIDES:${PN} += "libbrlapi-tcl.so.0.8 \
tcl-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
libtcl8.6.so \
tcl"

inherit rpm
