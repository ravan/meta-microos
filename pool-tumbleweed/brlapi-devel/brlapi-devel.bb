SUMMARY = "Library to use BRLTTY from applications -- Development Files"
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

RPM_NAME = "brlapi-devel-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "911c89fa38e5b3e2645eeaaf8a9033d4ed3bd7ddc6bad4f0a564b796b45a7199d9a4acb5ad4edce8790890c4286502d6bc1b98dc22d562c96351ea6246c9fbca"

RPROVIDES:${PN} += "brlapi-devel \
pkgconfig-brltty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrlapi0-8"

inherit rpm
