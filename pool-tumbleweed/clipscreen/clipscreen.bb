SUMMARY = "Mirror a portion of your screen to a virtual monitor for easier screen sharing"
DESCRIPTION = "clipscreen is a simple application that creates a virtual monitor that mirrors \
a portion of your screen. A green rectangle highlights the specified area. \
 \
Why's this useful? You can use any screen sharing tool (Google Meet, Microsoft \
Teams, Jitsi Meet, etc.) to share the virtual monitor instead of your entire \
screen. No need to share individual windows and having to switch between them, \
just move any window you want to share into the green border."
LICENSE = "MIT"

PV = "0+git.20241113"

RPM_NAME = "clipscreen-0+git.20241113-1.8.aarch64.rpm"
RPM_HASH = "48394e39e2e66ac9cb8212511bb02ab5542dc5084575ad9431c5acb1044e045c9f71951bacf16038208873a9c07f6307fed8d66a6665022b0364a4bbcc16d03c"

RPROVIDES:${PN} += "clipscreen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2"

inherit rpm
