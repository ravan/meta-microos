SUMMARY = "A key remapping daemon for linux"
DESCRIPTION = "Linux lacks a good key remapping solution. \
In order to achieve satisfactory results a medley of tools need to be employed \
(e.g xcape, xmodmap) with the end result often being tethered to a specified \
environment (X11). \
keyd attempts to solve this problem by providing a flexible system wide daemon \
which remaps keys using kernel level input primitives (evdev, uinput)."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "keyd-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "d2f97c25c7117b580532151101cf8cddc2fbae5a9c50212031b67e11fa57cffc54726279131c9c93b7ff9bd47e90fdedfe03604e98e0809002b3af303aea663d"

RPROVIDES:${PN} += "keyd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
sed \
shadow"

inherit rpm
