SUMMARY = "Graphical libinput debug tool"
DESCRIPTION = "This tool allows graphical libinput debugging. It visualizes \
all events processed by libinput."
LICENSE = "MIT"

PV = "1.31.3"

RPM_NAME = "libinput-debug-gui-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "c14c66ff577f4e2e796815a69ebe96081f5e7343547b7a8d3873b47d2b6df07989191abd72badab40b1f2eebfac9787985912953a9815ff5db6f0771d5587fad"

RPROVIDES:${PN} += "libinput-debug-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-tools \
libinput.so.10 \
libm.so.6 \
libudev.so.1 \
libwayland-client.so.0"

inherit rpm
