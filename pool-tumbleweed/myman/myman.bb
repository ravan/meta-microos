SUMMARY = "Text based Pacman clone"
DESCRIPTION = "MyMan is a video game for color and monochrome text \
terminals in the genre of Namco's Pac-Man. \
It includes many maze variations and several tile \
and sprite sets, ranging from large ASCII art through \
large pseudo-bitmap Unicode or CP437 graphics to \
single characters."
LICENSE = "MIT"

PV = "0.7.0+cvs20091030"

RPM_NAME = "myman-0.7.0+cvs20091030-2.29.aarch64.rpm"
RPM_HASH = "375c4d3f88286eea3d523423eb3c4deb7a5520a820f7935f49e0f789ffb02ebc4533bc5f54235033338203b3f5fbd65d76fa3014aef578174660c4b5c810685f"

RPROVIDES:${PN} += "myman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
