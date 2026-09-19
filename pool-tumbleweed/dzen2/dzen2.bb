SUMMARY = "A general purpose messaging and notification program"
DESCRIPTION = "Dezen is a general purpose messaging, notification and menuing program for X11. It was designed to be scriptable in any language and integrate well with window managers like dwm, wmii and xmonad though it will work with any windowmanger."
LICENSE = "MIT"

PV = "1379930259.488ab66"

RPM_NAME = "dzen2-1379930259.488ab66-1.28.aarch64.rpm"
RPM_HASH = "014dcfc5a527e5fbabca4b95aa550f627feaf1da9e12283fb373f83ae22e40009f0381c262e47b5ec1b2869b34e3bba1b4455c1edf82c557b42e25d4f29ab4e6"

RPROVIDES:${PN} += "dzen2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6"

inherit rpm
