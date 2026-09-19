SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "11.5"

RPM_NAME = "love-11.5-2.4.aarch64.rpm"
RPM_HASH = "dab9f2099d5f076c35ebfe185c4a4eaf35886ccca0c64ad92ab6eaf825abc57034659075a9a97125860a85bd25d92c3cc42200e775e4f04083d770a2377563fd"

RPROVIDES:${PN} += "liblove-11.5.so \
love"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libmodplug.so.1 \
libmpg123.so.0 \
libogg.so.0 \
libopenal.so.1 \
libstdc++.so.6 \
libtheoradec.so.2 \
libvorbisfile.so.3 \
libz.so.1 \
shared-mime-info"

inherit rpm
