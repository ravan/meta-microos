SUMMARY = "A multimedia file converter"
DESCRIPTION = "A program to convert your multimedia files to contemporary formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-0.2.4-2.12.aarch64.rpm"
RPM_HASH = "1cafbaf181f9bc2e7f2ee3ba02b6955c3654d69f34aeb07cb6c7beaf19bdbd52b0b7a5691fc69c0ee078d5dd21c4284b97e7af375cb55f7416b335a22df7527b"

RPROVIDES:${PN} += "ciano"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
