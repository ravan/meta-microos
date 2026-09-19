SUMMARY = "X11 authorization protocol library"
DESCRIPTION = "libXau provides mechanisms for individual access to an X Window \
System display. It uses existing core protocol and library hooks for \
specifying authorization data in the connection setup block to \
restrict use of the display to only those clients that show that they \
know a server-specific key called a 'magic cookie'."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "libXau6-1.0.12-2.5.aarch64.rpm"
RPM_HASH = "583fcff682940ac3ea37e9592eee04492de89084e3be611b418af18fecf4638e9e6489447b1eee7501e720802c64b8fef95245e2642b56a3018f52e07bb24bc1"

RPROVIDES:${PN} += "libXau.so.6 \
libXau6 \
xorg-x11-libXau"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
