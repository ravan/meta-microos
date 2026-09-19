SUMMARY = "X11 image viewer"
DESCRIPTION = "feh is an X11 image viewer aimed mostly at console users. It does not \
have a fancy GUI, but simply displays images. It is controlled via \
commandline arguments and configurable key/mouse actions. feh has \
multiple file modes using a slideshow or multiple windows. It \
supports the creation of montages as index prints with many \
user-configurable options."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.11.1"

RPM_NAME = "feh-3.11.1-1.7.aarch64.rpm"
RPM_HASH = "d685eff3279adeb4d89f8c8bf60f3e58dfeca420f878e1b7af71fec38537e4fafda1384fc28af0245df9514bcfa638ac9ede190dffc7b479fc1cecacb94ebaab"

RPROVIDES:${PN} += "feh"

RDEPENDS:${PN} += "desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libc.so.6 \
libcurl.so.4 \
libexif.so.12 \
libjpeg-turbo \
libm.so.6 \
libpng16.so.16"

inherit rpm
