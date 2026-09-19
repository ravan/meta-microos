SUMMARY = "X11 Screen Saver extension client library"
DESCRIPTION = "The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "libXss1-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "fdda5f791a7e16a852f1181d3c49134b059193961c97ae84a93cf7d7a4df7657f12dd786d71934a5927c8b7ddcb4413aa94783b4997c1b0be5512283165b1733"

RPROVIDES:${PN} += "libXScrnSaver \
libXss.so.1 \
libXss1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
