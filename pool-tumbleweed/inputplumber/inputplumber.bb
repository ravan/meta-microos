SUMMARY = "Input router and remapper daemon for Linux"
DESCRIPTION = "InputPlumber is a input routing and control daemon for Linux. \
It can be used to combine any number of input devices (like gamepads, \
mice, and keyboards) and translate their input to a variety of \
virtual device formats."
LICENSE = "GPL-3.0"

PV = "0.77.7"

RPM_NAME = "inputplumber-0.77.7-1.2.aarch64.rpm"
RPM_HASH = "704b3fc36768c7176291e5e89694037d3403dcf35ba197305e9de31ff975dab9d01645173b40e955bb3ba946722cd495b341ae67c12813faeeedcb7737c75aff"

RPROVIDES:${PN} += "InputPlumber \
inputplumber"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libiio.so.0 \
libm.so.6 \
libudev.so.1 \
polkit"

inherit rpm
