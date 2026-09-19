SUMMARY = "Development files for libt3window, a library for window-based terminal drawing"
DESCRIPTION = "libt3window library provides functions for manipulating the terminal \
and for creating (possibly overlapping) windows on a terminal. \
libt3window can be used instead of (n)curses for drawing on the \
terminal. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3window."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "libt3window-devel-0.4.2-1.5.aarch64.rpm"
RPM_HASH = "569177b4875dc76c8d07d2f36f8680197d701fba7e55f3b8d5204d0596a60720ccfafbbaf8b46dd5fbd6337b50900efc24db791bc2438d87da966b9d44346b50"

RPROVIDES:${PN} += "libt3window-devel \
pkgconfig-libt3window"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3window0 \
pkgconfig-libtranscript \
pkgconfig-tinfo"

inherit rpm
