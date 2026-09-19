SUMMARY = "Graphical User Interface to Control JACK Servers"
DESCRIPTION = "JACK Audio Connection Kit - Qt GUI Interface: A simple Qt application \
to control the JACK server. Written in C++ around the Qt4 toolkit \
for X11, most exclusively using Qt Designer. Provides a simple GUI \
dialog for setting several JACK server parameters, which are properly \
saved between sessions, and a way control of the status of the audio \
server. With time, this primordial interface has become richer by \
including a enhanced patchbay and connection control features."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "qjackctl-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "4f4993d9f7a0ea4b610538f2dc876208d44d1974b151523ed7df6f8c8f8d1d751a553d308010973508844bf5a5ac91d3ea29ef6385dc52d166aaf662a3665527"

RPROVIDES:${PN} += "qjackctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
