SUMMARY = "Prompt on exiting X"
DESCRIPTION = "`xtexit` sends an request to all clients to shut down. If the \
application still needs an user interaction (e.g., if a file should be \
saved) this is possible. \
 \
If you answer by the affirmative, all applications will be closed. This \
method is not fully waterproof, but better than killing each and every \
client without being able to interfere. \
 \
xterm applications anyway are killed immediately! \
 \
If this package is installed, it will be automatically integrated into \
the sample user fvwm menu."
LICENSE = "MIT"

PV = "0.42"

RPM_NAME = "xtexit-0.42-1253.4.aarch64.rpm"
RPM_HASH = "c09ebc8ce27a613f4046fd8076635006966c6f7fb5ebb160a0e70160af71f17770d49f29ab05b5e87f3e8189d5a6a6b4f1847c48b10cc6cf0d3393a85b9a9c47"

RPROVIDES:${PN} += "config-xtexit \
xtexit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
xaw3d"

inherit rpm
