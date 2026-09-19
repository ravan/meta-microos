SUMMARY = "X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libxkbfile1-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "b8e1f5f3393db148e46fd8be0143b46db15355f1a46426c1b5aa260a69c19ab95beef6b0dff46d5eb893be13cdb96b7f2c1d05e34bcd257be95094cc6ff732c7"

RPROVIDES:${PN} += "libxkbfile.so.1 \
libxkbfile1 \
xorg-x11-libxkbfile"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
xkeyboard-config"

inherit rpm
