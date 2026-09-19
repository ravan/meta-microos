SUMMARY = "Library to use BRLTTY from applications -- Java Bindings"
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

RPM_NAME = "brlapi-java-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "34ecf985e9782d9562581fbd817a5cdc9ab5056019f4d9c3a456bd1d717b9c092ad53900e86beefccb847563563336bf109070dc13d4b4a7f15bb80c203ab442"

RPROVIDES:${PN} += "brlapi-java \
libbrlapi-java.so.0.8"

RDEPENDS:${PN} += "java \
jpackage-utils \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
