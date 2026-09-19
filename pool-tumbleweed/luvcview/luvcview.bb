SUMMARY = "Simple V4L2 application using sdl"
DESCRIPTION = "luvcview is a simple V4L2 application using sdl \
 \
 \
 \
Authors: \
-------- \
    Laurent Pinchart \
    Michel Xhaard"
LICENSE = "GPL-2.0-or-later"

PV = "20070512"

RPM_NAME = "luvcview-20070512-29.6.aarch64.rpm"
RPM_HASH = "c68df9a11f7e97ffdbb161ab44c74b1655db8e2706657af77bfaf3abf33017a0b14d2c3640b1b425c2e734ca4aab1f1bf40f41c09f3cda688aa9a06cb9e9b28d"

RPROVIDES:${PN} += "luvcview"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
