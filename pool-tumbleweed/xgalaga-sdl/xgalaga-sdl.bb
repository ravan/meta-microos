SUMMARY = "Classic single screen vertical shoot em up SDL"
DESCRIPTION = "XGalaga-SDL is a port of the popular X11 game XGalaga, \
a clone of Galaga, using the SDL library. \
XGalaga was originally written by Joe Rumsey."
LICENSE = "GPL-2.0+"

PV = "2.1.1.0"

RPM_NAME = "xgalaga-sdl-2.1.1.0-1.38.aarch64.rpm"
RPM_HASH = "bede48ba9e22db5dd971cb0263ef549b9257e7b48a4604f5371e0ef7643bf159e5bdc3d123be79b1688a49932ec9c7875d7138e124b91431f8d407f4bf8924a2"

RPROVIDES:${PN} += "xgalaga-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.16 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6"

inherit rpm
