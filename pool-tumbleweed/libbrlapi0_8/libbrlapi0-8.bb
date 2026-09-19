SUMMARY = "Library to use BRLTTY from applications"
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

RPM_NAME = "libbrlapi0_8-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "c6f981c3cc5a920dfaf3ae229bf3fb3669db4f17969a740a9f5eb7fab77d35c975d4a3aea1875fc4f8b1fa5da04f4f2921f8fa936d3e38c9eb29cd56770b398d"

RPROVIDES:${PN} += "libbrlapi.so.0.8 \
libbrlapi0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
group-brlapi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
util-linux"

inherit rpm
