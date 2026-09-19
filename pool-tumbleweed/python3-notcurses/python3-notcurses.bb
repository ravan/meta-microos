SUMMARY = "Python3 bindings for the notcurses library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains the python3 bindings for the notcurses \
library."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "python3-notcurses-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "9ee3d37124021ee9353db14ce6180d02d42acbf3f8455d97cb7d31c441f3985d581a9c82592d79d4c00ac06378677f9dd63886d951a6b5f66040cb04dc884ccb"

RPROVIDES:${PN} += "python3-notcurses \
python3.13dist-notcurses \
python3dist-notcurses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses.so.3 \
python-abi"

inherit rpm
