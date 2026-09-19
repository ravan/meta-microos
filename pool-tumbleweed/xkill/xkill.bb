SUMMARY = "Utility to kill a client by its X resource"
DESCRIPTION = "xkill is a utility for forcing the X server to close connections to \
clients. This program is very dangerous, but is useful for aborting \
programs that have displayed undesired windows on a user's screen."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xkill-1.0.7-1.5.aarch64.rpm"
RPM_HASH = "543be1af944c547b09e28412c46407360bbdfa17aeb4968bf3bc5e296c0a50ee56d65036c592d3d3225c90f24045570c65bf826f33726a4cc028c4cf6aac7806"

RPROVIDES:${PN} += "xkill"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
