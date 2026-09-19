SUMMARY = "Utility to display X11 font names"
DESCRIPTION = "xfontsel application provides a simple way to display the X11 core \
protocol fonts known to your X server, examine samples of each, and \
retrieve the X Logical Font Description ('XLFD') full name for a font."
LICENSE = "X11"

PV = "1.1.2"

RPM_NAME = "xfontsel-1.1.2-1.3.aarch64.rpm"
RPM_HASH = "845bc6fe9fae66a58441287d21a3731437302211d56f05a9cfbc909888f9d17d248de3dec9e3d8ea876735e69f7703566c8ba8b802630734b66fd5496b966e00"

RPROVIDES:${PN} += "xfontsel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
