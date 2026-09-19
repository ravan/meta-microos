SUMMARY = "Customizable 3D real-time strategy game"
DESCRIPTION = "MegaGlest takes place in a context that could be compared to that of \
pre-Renaissance Europe with the twist that magic forces exist in the \
environment and can be controlled. \
 \
A game takes place on a map of varying size, such as large plains and \
fields, with terrain features like rivers, mountains, seas, or \
cliffs. Players must establish settlements to gain resources, defend \
against other players, and train units to explore the map and attack \
enemies."
LICENSE = "GPL-3.0-or-later"

PV = "3.13.0"

RPM_NAME = "megaglest-3.13.0-9.7.aarch64.rpm"
RPM_HASH = "ddd96af8963d670273d10b64c61d173860447035df46afa6672b22bffbaea162b43e059f0b577bc60c3a0edc9032a06591f420660a590e98af7fc0128447cc0c"

RPROVIDES:${PN} += "megaglest"

RDEPENDS:${PN} += "freefont \
gnu-free-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libfontconfig.so.1 \
libfribidi.so.0 \
libftgl.so.2 \
libgcc-s.so.1 \
libircclient.so.1 \
libjpeg.so.8 \
liblua5.4.so.5 \
libm.so.6 \
libminiupnpc.so.21 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libvlc.so.5 \
libvorbisfile.so.3 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-gl-suse.so.16.0.0 \
linux-libertine-fonts \
megaglest-data \
p7zip-full"

inherit rpm
