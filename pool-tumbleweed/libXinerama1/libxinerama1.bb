SUMMARY = "Xinerama extension to the X11 Protocol"
DESCRIPTION = "Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXinerama1-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "77ddb2ae52ceb7bb039a28787356bf1333db3db9700af4b590cc85803d68c9383b6cbc1b3afddce432d6fcc48bb30608cb20836e6d7035a7c82a3a970273752f"

RPROVIDES:${PN} += "libXinerama.so.1 \
libXinerama1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
