SUMMARY = "Utility to compile XKB keyboard description"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xkbcomp-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "c818f66ecf4be77827137d5113f70281c6541968d659a4575eba0f957d0692ed2bfea16f1df6c7143f7ca54e3ed74e929f19cb7e0991426531e08a86b43c17c9"

RPROVIDES:${PN} += "xkbcomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
