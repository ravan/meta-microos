SUMMARY = "The Tilde Toolkit's window-based terminal program library"
DESCRIPTION = "libt3window library provides functions for manipulating the terminal \
and for creating (possibly overlapping) windows on a terminal. \
libt3window can be used instead of (n)curses for drawing on the \
terminal."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "libt3window0-0.4.2-1.5.aarch64.rpm"
RPM_HASH = "900a6fc05a8feb60a612e8bd2c3f82645e7ecf729cf6c9155a522f8fe462ab9ff4ced05d4c590b6610ecc94c4ed9dae8d7fc9707b074649b41f66259be1b32b2"

RPROVIDES:${PN} += "libt3window.so.0 \
libt3window0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libtinfo.so.6 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
