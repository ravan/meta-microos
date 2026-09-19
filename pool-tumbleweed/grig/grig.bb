SUMMARY = "Graphical control program for hamlib"
DESCRIPTION = "Grig is a simple Ham Radio control (CAT) program based on Hamlib. It is \
intended to be highly generic presenting the user to the same graphical user \
interface regardless of which radio is being controlled. \
 \
Grig supports the most commonly used CAT commands that are implemented by \
Hamlib, and integrates well with other ham radio programs like Xlog and gMFSK. \
Thanks to Hamlib, grig works with most CAT-capable amateur radios."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "grig-0.9.0-2.7.aarch64.rpm"
RPM_HASH = "9507d1a901844ea525a0e72dd0c1d08b791670035b3c9a457cdf5e2cb0cb1b8d87ac417240d2483cf716ffbfc357c8c9d9e47e91008e281bcbbf0e1f2456cb61"

RPROVIDES:${PN} += "grig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libhamlib.so.4 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
