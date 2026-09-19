SUMMARY = "Simple file system browser"
DESCRIPTION = "Pilot is a simple, display-oriented file system browser based on the \
Pine message system composer. As with Pine, commands are displayed at \
the bottom of the screen, and context-sensitive help is provided."
LICENSE = "Apache-2.0"

PV = "2.99"

RPM_NAME = "pilot-2.99-31.3.aarch64.rpm"
RPM_HASH = "a9d80169d0ec8bba1b13eb22613f759c0526c50dd3334cd3815989435226c4972bd202202437b1ae4811f3cddbbdb623f3ddf5abb4b0fc46335a0defdb7deecb"

RPROVIDES:${PN} += "pilot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
