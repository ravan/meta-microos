SUMMARY = "X11 cut&paste utility"
DESCRIPTION = "Xcb provides access to the cut buffers built into every X server. It \
allows the buffers to be manipulated either via the command line or \
with the mouse in a point and click manner.  The buffers can be used as \
holding pens to store and retrieve arbitrary data fragments, so any \
number of different pieces of data can be saved and recalled later. The \
program is designed primarily for use with textual data."
LICENSE = "MIT"

PV = "2.5"

RPM_NAME = "xcb-2.5-205.7.aarch64.rpm"
RPM_HASH = "766bfa3b4bb22bc1a8a9e99fda1339176579c74007c9fe62d69b6500630fabc3ef178b678919ead290f2161ba0308a46c8059a5ad2c97855cc3ca6a79afe8e8e"

RPROVIDES:${PN} += "xcb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
