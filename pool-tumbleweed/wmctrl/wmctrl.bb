SUMMARY = "Command line tool to interact with an EWMH/NetWM compatible X Window Manager"
DESCRIPTION = "Wmctrl provides command line access to almost all the features defined \
in the EWMH specification. Using it, it's possible to, for example, \
obtain information about the window manager, get a detailed list of \
desktops and managed windows, switch and resize desktops, change number \
of desktops, make windows full-screen, always-above or sticky, and \
activate, close, move, resize, maximize and minimize them. \
 \
The command line access makes it easy to automate these tasks and \
execute them from any application that is able to run a command in \
response to some event. \
 \
Please note that wmctrl only works with window managers which implement \
this specification."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "wmctrl-1.07-152.10.aarch64.rpm"
RPM_HASH = "fe6d8f729f23f8364751dce73fc4c701df6274dcd5de96c28cd5c82818516157a8e965f8d4aa044a40a4685a722a990c49d9cd06fe7eff21f4416e47be47d13f"

RPROVIDES:${PN} += "wmctrl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
