SUMMARY = "Development files for notcurses"
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

RPM_NAME = "notcurses-devel-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "b79ad6cb524c3fe7bb3dc6fabfa3d80b8665c56d58c95831a4e8c931a4982bd87d0871505400a456dc8bcf3bb3319562d6c957cf76bcffdad91d0a9836218228"

RPROVIDES:${PN} += "cmake-Notcurses \
notcurses-devel \
pkgconfig-notcurses \
pkgconfig-notcurses-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses3 \
pkgconfig-notcurses-core \
pkgconfig-notcurses-ffi"

inherit rpm
