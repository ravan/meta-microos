SUMMARY = "A cuddly teddy bear for your X Window desktop"
DESCRIPTION = "Normally, xteddy just sits around doing nothing. After all, that's what \
teddy bears are for. Look at him, talk to him, place heavy windows on \
top of him, zap him around until he becomes dizzy, do what you like; he \
will always be your true (albeit virtual) friend. \
 \
You can move xteddy with the mouse by pointing at him and dragging him \
around. When clicked upon, he will pop up on top of all other windows. \
If you type 'q' on him, he will die (or, as I like to think of it, be \
tucked away in the file system until you need him next time). \
 \
That's it. But he's cute."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "xteddy-2.2-30.5.aarch64.rpm"
RPM_HASH = "0ef6319d6888a19c220db5853612fbacb0f4a228476e8faca15ac2ae427ccd769e068da9bc8810b4547ea3a47e79f8c0df57619cd6e147c5375384a57ed585f6"

RPROVIDES:${PN} += "xteddy \
xteddy10"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
