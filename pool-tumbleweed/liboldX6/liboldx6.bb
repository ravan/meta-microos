SUMMARY = "X version 10 backwards compatibility library"
DESCRIPTION = "This interface provides backwards compatibility for apps from X \
Version 10, which was the version of the X Window System from \
November 1985, replaced by X11 in September 1987."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "liboldX6-1.0.1-13.5.aarch64.rpm"
RPM_HASH = "6295b6b6cc3fdf299b746333ea967a060fdf42edee58f769defaa6fcbfca9b3e6712a576815ce3b6671816d31c0b7adfeee272d215e15b61dce38f822bfb4a89"

RPROVIDES:${PN} += "liboldX.so.6 \
liboldX6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
