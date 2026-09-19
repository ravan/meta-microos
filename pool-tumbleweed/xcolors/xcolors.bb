SUMMARY = "Displays colors defined in rgb.txt"
DESCRIPTION = "Xcolorsel displays colors defined in rgb.txt. You can create an RGB \
file by redirecting the output of showrgb to a file."
LICENSE = "SUSE-Public-Domain"

PV = "91.10.4"

RPM_NAME = "xcolors-91.10.4-1246.4.aarch64.rpm"
RPM_HASH = "dd70b302d5ff282ba5a6aba08b0e86a3664fcc418953c83240610765f6d3f7724822288eed96693667c96c2a06051ea36a087e49134478df6e553f802dc86893"

RPROVIDES:${PN} += "config-xcolors \
xcolors"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
