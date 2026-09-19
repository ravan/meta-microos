SUMMARY = "Development files for notcursescore"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses-core."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "notcurses-core-devel-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "d56ce9dff66ddd673d13076efc912c53af481a54571322f35ab0c99dc9dea6fe1a0acd169b85995e0d3adc0c4cf60866b19a9b7692e6cec994d59255ace0ba84"

RPROVIDES:${PN} += "cmake-NotcursesCore \
notcurses-core-devel \
pkgconfig-notcurses-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses-core3 \
pkgconfig-tinfo"

inherit rpm
