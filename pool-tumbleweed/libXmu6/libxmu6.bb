SUMMARY = "Miscellaneous utility routines for X"
DESCRIPTION = "The Xmu library is a collection of miscellaneous (some might say random) \
utility functions that have been useful in building various applications \
and widgets, specifically the Athena Widgets."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libXmu6-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "74f2ada90786e8136c0335ca809f45f6f347641921980f9c7968b9e4b7c58bef6d30a469b04ce632ebd351f3d78521a797c9d859eab0a4fbd974d372db6dd862"

RPROVIDES:${PN} += "libXmu.so.6 \
libXmu6 \
xorg-x11-libXmu"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXt.so.6 \
libc.so.6 \
xbitmaps"

inherit rpm
