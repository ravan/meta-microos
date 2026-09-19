SUMMARY = "Development files for notcurses++"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "notcurses++-devel-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "8071b0b535fe1800e8e2005554c2f8b177ba7ab6f0d65cf408152c2d3163b68795f9d2a738c83b44e4b1da8ba8e08efcbe72ae9414529c285154a182b68f6c08"

RPROVIDES:${PN} += "cmake-Notcurses++ \
notcurses++-devel \
pkgconfig-notcurses++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses++3 \
pkgconfig-notcurses"

inherit rpm
