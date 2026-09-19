SUMMARY = "WM Independent Touchpad Gesture Daemon for libinput"
DESCRIPTION = "gebaar-libinput is a window manager independent touchpad gesture \
daemon for libinput. Unlike other gesture daemons, such as \
libinput-gestures and fusuma, which parse the output of libinput \
debug-events, gebaar-libinput interfaces with libinput directly."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "gebaar-libinput-0.0.5-3.8.aarch64.rpm"
RPM_HASH = "dfc0e4926cb0b3551471cdffd60c215de5e9318a76e2503db0f97565341f45653341d7b0febfa81a4c6f29126eb7c6b6680b9985d7e5d2ed58368ea6473912aa"

RPROVIDES:${PN} += "gebaar-libinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libinput.so.10 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
