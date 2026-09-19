SUMMARY = "Utility to change the keyboard layout in X"
DESCRIPTION = "setxkbmap is an X11 client to change the keymaps in the X server for a \
specified keyboard to use the layout determined by the options listed \
on the command line."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "setxkbmap-1.3.5-1.2.aarch64.rpm"
RPM_HASH = "759322d66f9971efe4aedc95d9239c2f37272fa93ff0836105255d57df81679e5694362e0d05faa74fbacb9598aa267bb600b19b04885ec9006b4194ee66b603"

RPROVIDES:${PN} += "setxkbmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
