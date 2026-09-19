SUMMARY = "Collection of small utilities utilizing the X11 XKeyboard extension"
DESCRIPTION = "xkbutils is a collection of small utilities utilizing the XKeyboard \
(XKB) extension to the X11 protocol. \
 \
It includes: \
 xkbbell  - generate XKB bell events \
 xkbvleds - display the state of LEDs on an XKB keyboard in a window \
 xkbwatch - reports changes in the XKB keyboard state"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xkbutils-1.0.6-1.10.aarch64.rpm"
RPM_HASH = "3e18dd7855a70d13c69a84f8614d5492b4fc45ee7369f37ec857156719ba28ac6854a75b1186f251b049aaebeef196fb9b59e281a18b3406c17a83777b812682"

RPROVIDES:${PN} += "xkbutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
