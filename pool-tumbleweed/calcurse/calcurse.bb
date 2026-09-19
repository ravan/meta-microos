SUMMARY = "Text-based Organizer"
DESCRIPTION = "Calcurse is a text-based personal organizer which helps keep track of events \
and everyday tasks. It has a calendar and a 'todo' list, and puts your \
appointments in order. The user interface is configurable, and you can choose \
between different color schemes and layouts. All of the commands are \
documented within an online help system."
LICENSE = "BSD-2-Clause"

PV = "4.8.2"

RPM_NAME = "calcurse-4.8.2-1.6.aarch64.rpm"
RPM_HASH = "3baa05925370bd6f12826e0e5f6ac1c4f0ad30dbec57505de7e512e71b6c27fea4dabed54f384160f30de24be07170041ab52f6b1576e00ebc92adbda7c30b47"

RPROVIDES:${PN} += "calcurse"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
