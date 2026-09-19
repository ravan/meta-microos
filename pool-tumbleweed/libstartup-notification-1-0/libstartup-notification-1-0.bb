SUMMARY = "Reference Implementation for the Startup-Notification Protocol"
DESCRIPTION = "Startup-notification contains a reference implementation of the \
startup-notification protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12"

RPM_NAME = "libstartup-notification-1-0-0.12-17.9.aarch64.rpm"
RPM_HASH = "acfd0b2795832aa99ad2ac8e71a1aac6a5cdb96250f486fc22fa2afc2e8aa1d0fd6480ed894d3997d249966c6255337e145a9daf313786e4ef7162297398ed5b"

RPROVIDES:${PN} += "libstartup-notification-1-0 \
libstartup-notification-1.so.0 \
startup-notification"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libc.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
