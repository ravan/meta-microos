SUMMARY = "Libinput driver for the Xorg X server"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xf86-input-libinput-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "0856c419709019c92fc5338df096c413e1f57d55b724771b135cb531fc36e151aee5ba578cb1e54efb20452b3b45492964a1cfb98c427c0b0c4f72dc72e0033a"

RPROVIDES:${PN} += "libinput-drv.so \
xf86-input-libinput"

RDEPENDS:${PN} += "X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
libinput.so.10"

inherit rpm
