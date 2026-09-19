SUMMARY = "A JACK Audio Toolbox"
DESCRIPTION = "Cadence is a set of tools useful for audio production. \
Cadence itself is also an application (the main one). \
There are other applications that are part of the Cadence suite, \
they are usually named as the 'Cadence tools'. \
They are: \
 \
    Catarina \
    Catia \
    Claudia \
 \
Some of these also have sub-tools, such as Cadence-JackMeter and Claudia-Launcher."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "Cadence-0.9.2-2.10.aarch64.rpm"
RPM_HASH = "fdc1d30e7b8074cafc049fa59cc74fc92618d1adfed21d2cbb35af77bb707749c1e3d0a6fed54f307e7fc487f2cb38de4fe37b0d801b1fc34e6607e3eee59e38"

RPROVIDES:${PN} += "Cadence"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
a2jmidid \
dbus-1-python3 \
jack-capture \
ladish \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-qt5"

inherit rpm
