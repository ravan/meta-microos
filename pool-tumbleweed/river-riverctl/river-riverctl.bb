SUMMARY = "Command-line interface for controlling river"
DESCRIPTION = "A command-line utility used to control and configure river over the Wayland protocol."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-riverctl-0.3.12-2.6.aarch64.rpm"
RPM_HASH = "a0dadc756fc64dc9529b066ead8abce68a12910e1fb00645fbd6e4c3e06f0f75ec900987286a8cea443083e695ea59b7ef06886336030328e41584f0763f8547"

RPROVIDES:${PN} += "river-riverctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
