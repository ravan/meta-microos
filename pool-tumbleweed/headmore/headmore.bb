SUMMARY = "VNC client for character terminals"
DESCRIPTION = "headmore is a client for Virtual Network Computing (VNC), \
it is designed for running in character terminals such as \
Linux VT, xterm, or any other terminal emulator. headmore \
is fully capable of directing keyboard input to VNC and \
control mouse cursor movements."
LICENSE = "GPL-3.0"

PV = "1.2"

RPM_NAME = "headmore-1.2-1.33.aarch64.rpm"
RPM_HASH = "33b429335e26b33a8907f0d48f605ab4a9fb4c3d2aaa5589d50bec34410de1a73fc571dc123612dfd8e9c96192c12b1e294512dcb31b380af8f23443f198026a"

RPROVIDES:${PN} += "headmore"

RDEPENDS:${PN} += "libc.so.6 \
libcaca.so.0 \
libvncclient.so.1"

inherit rpm
