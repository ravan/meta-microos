SUMMARY = "LIRC GUI tools"
DESCRIPTION = "Some seldom used X11-based tools for debugging lirc configurations."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-tools-gui-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "95fbdd44ea8a5ab46d6118fb2aa6b66de623309fa2c9f86e986840bc295ce6828a5e06ebef128abeca03d70ee4b9619f1f214215494c61ad996bb5bd57bf1bfb"

RPROVIDES:${PN} += "lirc-tools-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
liblirc-client.so.0 \
liblirc.so.0 \
lirc-core \
xorg-x11-fonts-core"

inherit rpm
