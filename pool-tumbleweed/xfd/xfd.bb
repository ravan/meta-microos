SUMMARY = "Utility to display all the characters in an X font"
DESCRIPTION = "The xfd utility creates a window containing the name of the font being \
displayed, a row of command buttons, several lines of text for displaying \
character metrics, and a grid containing one glyph per cell."
LICENSE = "X11"

PV = "1.1.5"

RPM_NAME = "xfd-1.1.5-1.4.aarch64.rpm"
RPM_HASH = "0a05454e0b775cf626140adf3fb13f158f5481b551230db9017a50119942a34ba2ca79d6dac9da2ba32a303819775571d4c982032b614922aa0419d2d54aacee"

RPROVIDES:${PN} += "xfd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libxkbfile.so.1"

inherit rpm
