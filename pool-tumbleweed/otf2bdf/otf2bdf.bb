SUMMARY = "Conversion utility for OpenType outline fonts to BDF bitmap fonts"
DESCRIPTION = "otf2bdf is a command line utility that uses the FreeType 2 font \
rendering library to generate BDF bitmap fonts from OpenType outline \
fonts at different sizes and resolutions. This program is essentially \
the same as the ttf2bdf program, except that it uses FreeType 2.x, not \
FreeType 1.x, has some bug fixes, and includes a new command line \
parameter to print out the available encoding tables in the font."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "otf2bdf-3.1-1.5.aarch64.rpm"
RPM_HASH = "4d91d6a899124a7553a6cd74b729ebd021f90729c15b1037bd832c63af80c57ca5b296c0eb6aca0749e3e4758c20b90e3de11f10af53f3a7ddac9bb066960da3"

RPROVIDES:${PN} += "otf2bdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
