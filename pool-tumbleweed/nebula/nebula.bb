SUMMARY = "A scalable overlay networking tool"
DESCRIPTION = "Nebula is a scalable overlay networking tool with a focus on performance, \
simplicity and security. It lets you seamlessly connect computers anywhere \
in the world. It can be used to connect a small number of computers, \
but is also able to connect tens of thousands of computers."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "nebula-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "e27ac14ac2d3ea1a8faec94dad046b6e7083598b947a321a79cc4f110fdc29f5ae25204bb99b4388e7546bc345dc135e1dc64f0d99d5b4e35c2fbcbfb7cd38c7"

RPROVIDES:${PN} += "nebula"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
