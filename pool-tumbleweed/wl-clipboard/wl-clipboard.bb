SUMMARY = "Wayland Clipboard Utilities"
DESCRIPTION = "This project implements two command-line Wayland clipboard utilities, wl-copy and wl-paste, that let you easily copy data between the clipboard and Unix pipes, sockets, files and so on."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "wl-clipboard-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "6847cb7b8f6f0498d484783e9718428417696e3deb449d51b2d3ca741507e63c7980daa3e6ecfd67bb03544d3c1f647c963bffd6b32041980f80b14cc15f4df4"

RPROVIDES:${PN} += "wl-clipboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
