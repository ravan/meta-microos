SUMMARY = "Utility to list fonts available from an X server"
DESCRIPTION = "xlsfonts lists fonts available from an X server via the X11 core \
protocol."
LICENSE = "X11"

PV = "1.0.8"

RPM_NAME = "xlsfonts-1.0.8-1.9.aarch64.rpm"
RPM_HASH = "818c2a53f62c546bf03a0e8e412505241ef6f62b57a0686ffde64fee8d6a98df256c2752206d666a83e4e585faa17b821dcb0afb2b80923432bb44573b0671a0"

RPROVIDES:${PN} += "xlsfonts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
