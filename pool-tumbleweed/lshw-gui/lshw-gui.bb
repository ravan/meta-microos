SUMMARY = "HardWare LiSter (GUI Frontend)"
DESCRIPTION = "lshw (Hardware Lister) is a small tool to provide detailed informaton on the \
hardware configuration of the machine. It can report exact memory \
configuration, firmware version, mainboard configuration, CPU version and \
speed, cache config uration, bus speed, etc. on DMI-capable x86 systems and \
on some PowerPC machines (PowerMac G4 is known to work). \
 \
This package provides a graphical user interface to display hardware \
information. \
 \
For detailed information on lshw features and usage, please see the \
included documentation or go to the lshw Web page, \
http://www.ezix.org/software/lshw.html"
LICENSE = "GPL-2.0-only"

PV = "B.02.20"

RPM_NAME = "lshw-gui-B.02.20-3.3.aarch64.rpm"
RPM_HASH = "38406e89a6a8fd33de0828d1de6c6621d72b872deb5f5ed17bed4d985623951ad296e85f6f9a82070ed1d20e9a0198252efef9e32893426a1a18e1009c8ad917"

RPROVIDES:${PN} += "lshw-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
lshw"

inherit rpm
